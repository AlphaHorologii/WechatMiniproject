package com.example.library.service;

import com.example.library.vo.AuthorVO;

public interface AuthorDisplayService {
    AuthorVO getAuthorByID(int authorID);
    String getAuthornameById(int authorID);
}
