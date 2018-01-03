package com.twu.biblioteca.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date publishedDate;
    private boolean isAvaliable;


    public Book(String name, String author, Date publishedDate){
        this.name =  name;
        this.author = author;
        this.publishedDate =  publishedDate;
        this.isAvaliable = true;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getFormattedPublishDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this.publishedDate);
    }

    public boolean isAvaliable() {
        return this.isAvaliable;
    }

    public void setAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;

        return this.toString().equals(book.toString());
    }

    @Override
    public String toString() {
        return this.getAuthor() + " - " + this.getFormattedPublishDate() + " - " + this.getFormattedPublishDate();
    }
}
