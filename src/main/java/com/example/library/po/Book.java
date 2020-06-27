package com.example.library.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer bookID;
    private Integer categoryID;
    private Integer authorID;
    private String image;
    private String summary;
    private String publisher;
    private String title;
    private double rating;
    private String publishDate;
    private String catalog;
}
