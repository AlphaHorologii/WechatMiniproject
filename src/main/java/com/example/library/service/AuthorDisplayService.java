package com.example.library.service;

import com.example.library.vo.ResponseVO;

public interface AuthorDisplayService {
    ResponseVO getAuthorByID(int authorID);
}
