package com.example.library.bl;

import com.example.library.po.Author;
import com.example.library.vo.AuthorVO;
import com.example.library.vo.ResponseVO;

public interface AuthorDisplayService {
    AuthorVO getAuthorByID(int authorID);
    String getAuthornameById(int authorID);
}
