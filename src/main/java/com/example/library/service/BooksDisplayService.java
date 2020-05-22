package com.example.library.service;

import com.example.library.vo.ResponseVO;

public interface BooksDisplayService {
    ResponseVO getBookByID(int bookID);
    ResponseVO getBooksByType(int typeID);
}
