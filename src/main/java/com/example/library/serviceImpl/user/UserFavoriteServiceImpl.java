package com.example.library.serviceImpl.user;

import com.example.library.data.user.UserFavoriteMapper;
import com.example.library.service.library.BooksService;
import com.example.library.service.user.UserFavoriteService;
import com.example.library.vo.BookVO;
import com.example.library.vo.ResponseVO;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserFavoriteServiceImpl implements UserFavoriteService {
    private final static String FAVORITE_EXISTS = "该书目已经在您的收藏中。";

    @Autowired
    UserFavoriteMapper userFavoriteMapper;

    @Autowired
    BooksService booksService;

    @Override
    public ArrayList<BookVO> getUserFavorite(Integer userID) {
        ArrayList<BookVO> bookVOs = new ArrayList<>();
        ArrayList<Integer> bookIDs = userFavoriteMapper.getAllFavorite(userID);
        for (Integer bookID:bookIDs) {
            bookVOs.add(booksService.getBookByID(bookID));
        }
        return bookVOs;
    }

    @Override
    public ResponseVO updateFavorite(Integer userID, Integer bookID, String action) {
        if(action.equals("remove")){
            userFavoriteMapper.removeFavorite(userID, bookID);
        }else if(action.equals("add")){
            if(userFavoriteMapper.isUserFavorite(userID, bookID) != 0){
                return ResponseVO.buildFailure(FAVORITE_EXISTS);
            }
            userFavoriteMapper.addFavorite(userID, bookID);
        }
        return ResponseVO.buildSuccess();
    }
}
