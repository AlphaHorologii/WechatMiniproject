package com.example.library.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class CategoryVO {
    private Integer categoryID;
    private String categoryName;
    private String image;
    private String introduction;
    private Integer heat;

    private Integer booksCount;
    private ArrayList<String> famousAuthors;
}
