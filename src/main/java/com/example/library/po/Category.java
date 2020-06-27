package com.example.library.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Integer categoryID;
    private String categoryName;
    private String image;
    private String introduction;
    private Integer heat;
}
