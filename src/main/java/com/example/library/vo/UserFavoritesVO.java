package com.example.library.vo;

import java.util.ArrayList;

public class UserFavoritesVO {
    private Integer userID;
    private ArrayList<Integer> favorites;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public ArrayList<Integer> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Integer> favorites) {
        this.favorites = favorites;
    }
}
