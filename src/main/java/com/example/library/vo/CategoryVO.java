package com.example.library.vo;

import java.util.List;

public class CategoryVO {

    private Integer id;
    private String categoryName;
    private String image;
    private String motto;
    private Integer heat;
    //上面是数据库有的

    private Integer booknums;
    private List<String> famous_authors;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getBooknums() {
        return booknums;
    }

    public void setBooknums(Integer booknums) {
        this.booknums = booknums;
    }

    public List<String> getFamous_authors() {
        return famous_authors;
    }

    public void setFamous_authors(List<String> famous_authors) {
        this.famous_authors = famous_authors;
    }

}
