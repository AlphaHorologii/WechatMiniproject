package com.example.library.data.library;

import com.example.library.po.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface BooksMapper {
    ArrayList<Book> getBooksByAuthorID(@Param("authorID") Integer authorID);

    ArrayList<Book> getAllBooks();

    Book getBookByID(@Param("bookID")Integer bookID);

    Integer getBooksCountByCategoryID(@Param("categoryID") Integer categoryID);

    ArrayList<Book> getBooksByCategoryID(@Param("categoryID") Integer categoryID);

    ArrayList<Book> searchBooksByKeyword(@Param("keyword")String keyword);

    void addBook(Book book);

    void updateBook(Integer bookID, Book book);
}
