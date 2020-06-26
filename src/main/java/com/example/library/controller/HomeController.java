package com.example.library.controller;

import com.example.library.service.CategoryService;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    CategoryService service;

    @GetMapping("/allCategory")
    public ResponseVO getAllCategory(){
        return ResponseVO.buildSuccess(service.getAllCategory());
    }
}
