package com.example.library.service.library;

import com.example.library.vo.AuthorInfoVO;
import com.example.library.vo.AuthorVO;
import com.example.library.vo.ResponseVO;

import java.util.ArrayList;

public interface AuthorService {
    ArrayList<AuthorVO> getAllAuthors();

    ArrayList<AuthorVO> searchAuthorsByKeyword(String keyword);

    ResponseVO addAuthor(AuthorInfoVO authorInfoVO);

    ResponseVO updateAuthor(Integer authorID, AuthorInfoVO authorInfoVO);

    AuthorVO getAuthorByID(Integer authorID);

    ArrayList<AuthorVO> getAuthorByCategoryID(Integer categoryID);
}
