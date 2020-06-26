package com.example.library.vo;

import java.util.ArrayList;

public class CategoryVO {
    private Integer categoryID;
    private String categoryName;
    private String image;
    private String introduction;
    private Integer heat;

    private Integer booksCount;
    private ArrayList<String> famousAuthors;

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(Integer booksCount) {
        this.booksCount = booksCount;
    }

    public ArrayList<String> getFamousAuthors() {
        return famousAuthors;
    }

    public void setFamousAuthors(ArrayList<String> famousAuthors) {
        this.famousAuthors = famousAuthors;
    }
}
