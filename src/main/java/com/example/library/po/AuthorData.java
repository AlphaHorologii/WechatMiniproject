package com.example.library.po;

import java.net.URL;
import java.util.List;

public class AuthorData {
    private int authorID;
    private URL imgURL;
    private String name;
    private String country;
    private String info;
    private List<BookData> books;

    public int getAuthorID() {
        return authorID;
    }

    public URL getImgURL() {
        return imgURL;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getInfo() {
        return info;
    }

    public List<BookData> getBooks() {
        return books;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setImgURL(URL imgURL) {
        this.imgURL = imgURL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setBooks(List<BookData> books) {
        this.books = books;
    }
}
