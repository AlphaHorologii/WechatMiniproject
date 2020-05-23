package com.example.library.controller;

import com.example.library.bl.AuthorDisplayService;
import com.example.library.po.Author;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorDisplayService service;

    @GetMapping("/{authorID}/info")
    public Author showAuthor(@PathVariable String authorID){
        return service.getAuthorByID(Integer.parseInt(authorID));
    }
}
