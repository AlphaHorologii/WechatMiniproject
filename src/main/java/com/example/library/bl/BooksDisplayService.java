package com.example.library.bl;

import com.example.library.vo.ResponseVO;

public interface BooksDisplayService {
    ResponseVO getBookByID(int bookID);
    ResponseVO getBooksByType(int typeID);
}
