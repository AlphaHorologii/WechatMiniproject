package com.example.library.vo;

import com.example.library.enums.UserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
    private Integer userID;
    private String email;
    private String password;
    private String username;
    private String stuNumber;
    private UserType userType;
}
