package com.example.androidhormwork77;

public class OnBoardModel {
    String title, description;
    int image;

    public OnBoardModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
