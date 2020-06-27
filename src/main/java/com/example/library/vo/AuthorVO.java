package com.example.library.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class AuthorVO {
    private Integer authorID;
    private String image;
    private String name;
    private String country;
    private String introduction;
    private String categoryName;
    private Integer bookCount;

    private ArrayList<BookVO> books;
}
