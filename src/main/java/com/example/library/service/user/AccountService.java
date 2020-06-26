package com.example.library.service.user;

import com.example.library.vo.ResponseVO;
import com.example.library.vo.UserInfoVO;
import com.example.library.vo.UserLoginVO;
import com.example.library.vo.UserVO;

public interface AccountService {
    ResponseVO registerAccount(UserLoginVO userLoginVO);

    UserVO login(UserLoginVO userLoginVO);

    UserVO getUserInfo(Integer userID);

    ResponseVO updateUserInfo(UserInfoVO userInfoVO);
}
