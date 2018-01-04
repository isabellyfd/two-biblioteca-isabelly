package com.twu.biblioteca.entity;

public class Book {
    private String name;
    private String author;
    private int publishYear;
    private boolean isAvaliable;


    public Book(String name, String author, int publishYear){
        this.name =  name;
        this.author = author;
        this.publishYear =  publishYear;
        this.isAvaliable = true;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public boolean isAvailable() {
        return this.isAvaliable;
    }

    public void setAvailable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;

        return this.toString().equals(book.toString());
    }

    @Override
    public String toString() {
        return this.getName() + " by " + this.getAuthor() + " - " + this.getPublishYear();
    }
}
