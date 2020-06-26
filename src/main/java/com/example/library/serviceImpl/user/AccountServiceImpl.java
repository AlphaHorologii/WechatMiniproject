package com.example.library.serviceImpl.user;

import com.example.library.data.user.AccountMapper;
import com.example.library.po.User;
import com.example.library.service.user.AccountService;
import com.example.library.vo.ResponseVO;
import com.example.library.vo.UserInfoVO;
import com.example.library.vo.UserLoginVO;
import com.example.library.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final static String ACCOUNT_EXISTS = "该邮箱已被注册。";

    @Autowired
    AccountMapper accountMapper;

    @Override
    public ResponseVO registerAccount(UserLoginVO userLoginVO) {
        if(accountMapper.getAccountByEmail(userLoginVO.getEmail()) != null)
            return ResponseVO.buildFailure(ACCOUNT_EXISTS);
        User user = new User();
        BeanUtils.copyProperties(userLoginVO, user);
        accountMapper.register(user);
        return ResponseVO.buildSuccess();
    }

    @Override
    public UserVO login(UserLoginVO userLoginVO) {
        User user = accountMapper.getAccountByEmail(userLoginVO.getEmail());
        if(user == null || !userLoginVO.getPassword().equals(user.getPassword())){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

    @Override
    public UserVO getUserInfo(Integer userID) {
        User user = accountMapper.getAccountByID(userID);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

    @Override
    public ResponseVO updateUserInfo(UserInfoVO userInfoVO) {
        User user = new User();
        BeanUtils.copyProperties(userInfoVO, user);
        try {
            accountMapper.updateInfo(user);
            return ResponseVO.buildSuccess();
        } catch (Exception exception){
            return ResponseVO.buildFailure();
        }
    }
}
