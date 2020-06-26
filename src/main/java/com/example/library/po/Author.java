package com.example.library.po;

import java.net.URL;
import java.util.List;

public class Author {
    private Integer authorid;
    private String image;
    private String name;
    private String country;
    private String intro;
    private Integer totalBook;
    private Integer categoryid;
    public Integer getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(Integer totalBook) {
        this.totalBook = totalBook;
    }
}
