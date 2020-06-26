package com.example.library.service.library;

import com.example.library.vo.BookVO;
import com.example.library.vo.ResponseVO;

import java.util.ArrayList;

public interface BooksService {
    BookVO getBookByID(Integer bookID);

    ArrayList<BookVO> getBooksByCategoryID(Integer categoryID);

    ArrayList<BookVO> getBooksByAuthorID(Integer authorID);

    ArrayList<BookVO> searchBooksByKeyword(String keyword);

    ArrayList<BookVO> getAllBooks();

    ResponseVO addBook(BookVO bookVO);

    ResponseVO updateBook(Integer bookID, BookVO bookVO);

    ResponseVO isUserFavorite(Integer userID, Integer bookID);
}
