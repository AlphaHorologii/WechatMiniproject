package com.example.library.bl;

import com.example.library.po.Book;
import com.example.library.vo.CategoryBookVO;
import com.example.library.vo.ResponseVO;

import java.util.List;

public interface BooksDisplayService {
    Book getBookByID(Integer bookID);
//    ResponseVO getBooksByType(int typeID);
    List<Book> getAllBooks();
//    List<Book> getBooksByAuthorId(Integer authorid);
    List<CategoryBookVO> getBooksBycategoryId(Integer categoryId);
}
