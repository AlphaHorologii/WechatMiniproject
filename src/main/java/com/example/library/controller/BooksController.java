package com.example.library.controller;

import com.example.library.service.BooksDisplayService;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BooksDisplayService service;

    @GetMapping("/{typeID}")
    public ResponseVO showBooks(@PathVariable String typeID){
        return service.getBooksByType(Integer.parseInt(typeID));
    }
}
