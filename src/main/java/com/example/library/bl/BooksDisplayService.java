package com.example.library.bl;

import com.example.library.po.Book;
import com.example.library.vo.CategoryBookVO;
import com.example.library.vo.ResponseVO;

import java.util.List;

public interface BooksDisplayService {
    Book getBookByID(Integer bookID);

    List<Book> getAllBooks();

//  List<Book> getBooksByAuthorId(Integer authorid);

    List<CategoryBookVO> getBooksByCategoryId(Integer categoryId);
}
