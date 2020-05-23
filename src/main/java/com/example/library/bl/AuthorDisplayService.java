package com.example.library.bl;

import com.example.library.po.Author;
import com.example.library.vo.ResponseVO;

public interface AuthorDisplayService {
    Author getAuthorByID(int authorID);
}
