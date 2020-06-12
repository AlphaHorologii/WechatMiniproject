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

//  @GetMapping("/{typeID}")
//  public ResponseVO showBooks(@PathVariable String typeID){
//      return service.getBooksByType(Integer.parseInt(typeID));
//  }

    @GetMapping("/all")
    public ResponseVO getAllBooks(){
        return ResponseVO.buildSuccess( service.getAllBooks());
    }

    @GetMapping("/{bookId}/detail")
    public ResponseVO getBookByID(@PathVariable String bookId){
        return ResponseVO.buildSuccess( service.getBookByID(Integer.parseInt(bookId)));
    }

//  public ResponseVO getBooksByAuthorId(@PathVariable String authorId){
//      return ResponseVO.buildSuccess(service.getBooksByAuthorId(Integer.parseInt(authorId)));
//  }

    @GetMapping("/bookCategory/{categoryId}")
    public ResponseVO getBooksByCategoryId(@PathVariable String categoryId){
        return ResponseVO.buildSuccess(service.getBooksByCategoryId(Integer.parseInt(categoryId)));
    }
}
