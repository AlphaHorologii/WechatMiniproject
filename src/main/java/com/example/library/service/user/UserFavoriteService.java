package com.example.library.service.user;

import com.example.library.vo.BookVO;
import com.example.library.vo.ResponseVO;

import java.util.ArrayList;

public interface UserFavoriteService {
    ArrayList<BookVO> getUserFavorite(Integer userID);

    ResponseVO updateFavorite(Integer userID, Integer bookID, String action);
}
