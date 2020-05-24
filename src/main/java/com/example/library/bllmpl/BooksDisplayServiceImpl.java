package com.example.library.bllmpl;


import com.example.library.bl.BooksDisplayService;
import com.example.library.data.book.BookMapper;
import com.example.library.po.Book;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksDisplayServiceImpl implements BooksDisplayService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public Book getBookByID(Integer bookID) {
        return bookMapper.getBookById(bookID);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.selectAllBooks();
    }

    @Override
    public List<Book> getBooksByAuthorId(Integer authorid) {
        return bookMapper.selectBooksByAuthorId(authorid);
    }

//    @Override

}
