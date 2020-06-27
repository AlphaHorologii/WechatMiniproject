package com.example.library.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookVO {
    private Integer bookID;
    private Integer categoryID;
    private String categoryName;
    private Integer authorID;
    private String authorName;
    private String image;
    private String summary;
    private String publisher;
    private String title;
    private double rating;
    private String publishDate;
    private String catalog;
}
