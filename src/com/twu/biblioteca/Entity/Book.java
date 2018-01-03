package com.twu.biblioteca.Entity;

import java.text.SimpleDateFormat;
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

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getFormatedPublishDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formatedString = dateFormat.format(this.publishedDate);
        return formatedString;
    }

    public boolean isAvaliable() {
        return false;
    }
}
