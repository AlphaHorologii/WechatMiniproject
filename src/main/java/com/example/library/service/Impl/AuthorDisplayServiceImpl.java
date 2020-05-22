package com.example.library.service.Impl;

import com.example.library.data.AuthorsMapper;
import com.example.library.service.AuthorDisplayService;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorDisplayServiceImpl implements AuthorDisplayService {
    @Autowired
    AuthorsMapper mapper;
    @Override
    public ResponseVO getAuthorByID(int authorID) {
        return null;
    }
}
