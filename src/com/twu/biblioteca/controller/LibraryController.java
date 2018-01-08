package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.exception.CouldNotCheckoutBookException;
import com.twu.biblioteca.exception.CouldNotReturnBookException;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class LibraryController {
    private ArrayList<Book> bookList;
    private ArrayList<Movie> movieList;

    public LibraryController(ArrayList<Book> bookList, ArrayList<Movie> movieList){
        this.bookList = bookList;
        this.movieList = movieList;
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

    public void checkoutBookAt(int index) throws CouldNotCheckoutBookException {
        Book book = this.getBookAtIndex(index);
        if (book.isAvailable()){
            book.setAvailable(false);
        }else {
            throw new CouldNotCheckoutBookException();
        }
    }

    public ArrayList<Book> listAllBorrowedBooks() {
        ArrayList<Book> borrowedBooks = this.bookList.stream()
                                            .filter(book -> !book.isAvailable())
                                            .collect(Collectors.toCollection(ArrayList::new));

        return borrowedBooks;
    }

    public void returnBook(Book book) throws CouldNotReturnBookException{
        for(Book bookInLibrary : this.bookList){
            if (bookInLibrary.equals(book)){
                bookInLibrary.setAvailable(true);
                return;
            }
        }
        throw new CouldNotReturnBookException();
    }

    public ArrayList<Movie> listAllAvailableMovies() {
        ArrayList<Movie> movies = this.movieList.stream()
                                                .filter(movie -> movie.isAvailable())
                                                .collect(Collectors.toCollection(ArrayList::new));
        return movies;
    }

}
