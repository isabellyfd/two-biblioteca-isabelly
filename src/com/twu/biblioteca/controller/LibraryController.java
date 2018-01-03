package com.twu.biblioteca.controller;

import com.twu.biblioteca.Entity.Book;
import java.util.ArrayList;

public class LibraryController {
    private ArrayList<Book> bookList;

    public LibraryController(ArrayList<Book> bookList){
        this.bookList =  bookList;
    }

    public ArrayList<Book> getBookList() {
        return this.bookList;
    }

}
