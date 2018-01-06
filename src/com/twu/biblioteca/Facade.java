package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;

public class Facade {

    public Facade shared = new Facade();
    private LibraryController library = new LibraryController();

    private Facade() {}

    public ArrayList<Book> getAllAvaliableBooks() {
        return this.library.listAllAvailableBooks();
    }
}
