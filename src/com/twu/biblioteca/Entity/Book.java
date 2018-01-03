package com.twu.biblioteca.Entity;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date publishedDate;

    public Book(String name, String author, Date publishedDate){
        this.name =  name;
        this.author = author;
        this.publishedDate =  publishedDate;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getAuthor(String author) {
        return this.author;
    }

    public String getFormatedPublishDate(String formatedString) {
        return formatedString;
    }
}
