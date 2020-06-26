package com.example.library.data.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface UserFavoriteMapper {
    ArrayList<Integer> getAllFavorite(@Param("userID")Integer userID);

    Integer isUserFavorite(@Param("userID")Integer userID, @Param("bookID")Integer bookID);

    void removeFavorite(@Param("userID")Integer userID, @Param("bookID")Integer bookID);

    void addFavorite(@Param("userID")Integer userID, @Param("bookID")Integer bookID);
}
