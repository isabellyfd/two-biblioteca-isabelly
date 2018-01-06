package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;

public class Facade {

    public static final Facade shared = new Facade();
    private LibraryController library;

    private Facade() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));
        this.library = new LibraryController(books);
    }

    public ArrayList<Book> getAllAvailableBooks() {
        return this.library.listAllAvailableBooks();
    }
}
