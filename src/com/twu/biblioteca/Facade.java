package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.exception.CouldNotCheckoutBookException;
import com.twu.biblioteca.exception.CouldNotReturnBookException;

import java.util.ArrayList;

public class Facade {

    public static final Facade shared = new Facade();
    private LibraryController library;

    private Facade() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Little Miss Sunshine", "Jonathan Dayton, Valerie Faris", 2006, 5.0));
        movieList.add(new Movie("Into the wild", "Sean Penn", 2008, 5.0));
        this.library = new LibraryController(books, movieList);
    }

    public ArrayList<Book> getAllAvailableBooks() {
        return this.library.listAllAvailableBooks();
    }

    public Book getBookAt(int index){
        return this.library.getBookAtIndex(index);
    }

    public void checkoutBookAt(int index) throws CouldNotCheckoutBookException{
        this.library.checkoutBookAt(index);
    }

    public ArrayList<Book> getAllBorrowedBooks() {
        return this.library.listAllBorrowedBooks();
    }

    public void returnBook(Book book) throws CouldNotReturnBookException{
        this.library.returnBook(book);
    }

    public ArrayList<Movie>  getAllAvailableMovies() {
        return this.library.listAllAvailableMovies();
    }
}

