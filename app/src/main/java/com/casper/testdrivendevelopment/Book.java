package com.casper.testdrivendevelopment;

/**
 * Created by jszx on 2019/9/24.
 */

public class Book {
    private String title;

    public Book(String title, int coverResourceID) {
        this.setTitle(title);
        this.setCoverResourceID(coverResourceID);
    }

    private int coverResourceID;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCoverResourceID() {
        return coverResourceID;
    }

    public void setCoverResourceID(int coverResourceID) {
        this.coverResourceID = coverResourceID;
    }
}
