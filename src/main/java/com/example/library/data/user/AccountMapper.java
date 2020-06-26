package com.example.library.data.user;

import com.example.library.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountMapper {
    void register(User user);

    void updateInfo(User user);

    User getAccountByID(@Param("userID")Integer userID);

    User getAccountByEmail(@Param("email")String email);
}
