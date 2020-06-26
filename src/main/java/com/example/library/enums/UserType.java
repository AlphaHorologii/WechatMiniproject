package com.example.library.enums;

public enum UserType {
    Client("1"),
    Admin("2");
    private final String value;

    UserType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
