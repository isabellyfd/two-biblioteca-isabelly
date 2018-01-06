package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Book;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LibraryController {
    private ArrayList<Book> bookList;

    public LibraryController(ArrayList<Book> bookList){
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return this.bookList;
    }

    public ArrayList<Book> listAllAvailableBooks() {

        ArrayList<Book> books = this.bookList.stream()
                                    .filter(book -> book.isAvailable())
                                    .collect(Collectors.toCollection(ArrayList::new));
        return books;
    }

    public Book getBookAtIndex(int index){
        return this.bookList.get(index);
    }

}
