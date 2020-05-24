package com.example.library.controller;

import com.example.library.bl.BooksDisplayService;
import com.example.library.po.Book;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BooksController {
    @Autowired
    BooksDisplayService service;

//    @GetMapping("/{typeID}")
//    public ResponseVO showBooks(@PathVariable String typeID){
//        return service.getBooksByType(Integer.parseInt(typeID));
//    }
    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }
    @GetMapping("/{bookId}/detail")
    public Book getBookByID(@PathVariable String bookId){
        return service.getBookByID(Integer.parseInt(bookId));
    }
    @GetMapping("/{authorId}/allbooks")
    public List<Book> getBooksByAuthorId(@PathVariable String authorId){
        return service.getBooksByAuthorId(Integer.parseInt(authorId));
    }
}
