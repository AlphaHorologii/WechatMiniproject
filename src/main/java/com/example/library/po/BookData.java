package com.example.library.po;

import com.example.library.enums.Rating;

import java.net.URL;

public class BookData {
    private int bookID;
    private URL imgURL;
    private String summary;
    private String publisher;
    private String title;
    private Rating rating;
    private String pubDate;
    private String author;
    private String authorInfo;
    private int authorID;
    private String type;
    private int typeID;

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setImgURL(URL imgURL) {
        this.imgURL = imgURL;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthorInfo(String authorInfo) {
        this.authorInfo = authorInfo;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getBookID() {
        return bookID;
    }

    public URL getImgURL() {
        return imgURL;
    }

    public String getSummary() {
        return summary;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public Rating getRating() {
        return rating;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorInfo() {
        return authorInfo;
    }

    public int getAuthorID() {
        return authorID;
    }

    public String getType() {
        return type;
    }

    public int getTypeID() {
        return typeID;
    }
}
