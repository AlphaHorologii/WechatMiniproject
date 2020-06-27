package com.example.library.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private Integer authorID;
    private String image;
    private String name;
    private String country;
    private String introduction;
    private Integer bookCount;
    private Integer categoryID;
}
