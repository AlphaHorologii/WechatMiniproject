package com.example.library.enums;

public enum Rating {
    Five("5.0"),
    Four("4.0"),
    Three("3.0"),
    Two("2.0"),
    One("1.0");

    private String val;

    Rating(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
