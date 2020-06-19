package com.example.library.service;

import com.example.library.po.Book;
import com.example.library.vo.CategoryBookVO;

import java.util.List;

public interface BooksDisplayService {
    Book getBookByID(Integer bookID);

    List<Book> getAllBooks();

//  List<Book> getBooksByAuthorId(Integer authorid);

    List<CategoryBookVO> getBooksByCategoryId(Integer categoryId);
}
