package com.example.library.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UserFavoritesVO {
    private Integer userID;
    private ArrayList<Integer> favorites;
}
