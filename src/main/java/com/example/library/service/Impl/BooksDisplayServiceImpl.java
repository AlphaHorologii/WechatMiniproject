package com.example.library.service.Impl;

import com.example.library.data.BooksMapper;
import com.example.library.service.BooksDisplayService;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksDisplayServiceImpl implements BooksDisplayService {
    @Autowired
    BooksMapper mapper;
    @Override
    public ResponseVO getBookByID(int bookID) {
        return null;
    }

    @Override
    public ResponseVO getBooksByType(int typeID) {
        return null;
    }
}
