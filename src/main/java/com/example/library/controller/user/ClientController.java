package com.example.library.controller.user;

import com.example.library.service.user.AccountService;
import com.example.library.service.user.UserFavoriteService;
import com.example.library.vo.ResponseVO;
import com.example.library.vo.UserInfoVO;
import com.example.library.vo.UserLoginVO;
import com.example.library.vo.UserVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@Api(value = "Client")
public class ClientController {
    private final static String LOGIN_ERROR = "用户名或密码错误。";

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserFavoriteService userFavoriteService;

    @PostMapping("/login")
    public ResponseVO login(@RequestBody UserLoginVO loginVO){
        UserVO userVO = accountService.login(loginVO);
        if(userVO == null){
            return ResponseVO.buildFailure(LOGIN_ERROR);
        }
        return ResponseVO.buildSuccess(userVO);
    }

    @PostMapping("/register")
    public ResponseVO register(@RequestBody UserLoginVO loginVO){
        return accountService.registerAccount(loginVO);
    }

    @PostMapping("/update")
    public ResponseVO updateAccountInfo(@RequestBody UserInfoVO userInfoVO){
        return ResponseVO.buildSuccess(accountService.updateUserInfo(userInfoVO));
    }

    @GetMapping("/user={userID}")
    public ResponseVO getAccountInfo(@PathVariable Integer userID){
        return ResponseVO.buildSuccess(accountService.getUserInfo(userID));
    }

    @GetMapping("/user={userID}/favorite")
    public ResponseVO getUserFavorite(@PathVariable Integer userID){
        return ResponseVO.buildSuccess(userFavoriteService.getUserFavorite(userID));
    }

    @PostMapping("/user={userID}/favorite/update")
    public ResponseVO updateFavorite(@PathVariable Integer userID,
                                     @RequestParam String bookID,
                                     @RequestParam String action){
        return userFavoriteService.updateFavorite(userID, Integer.parseInt(bookID), action);
    }
}
