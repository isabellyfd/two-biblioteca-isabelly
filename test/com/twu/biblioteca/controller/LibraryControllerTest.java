package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.exception.CouldNotCheckoutBookException;
import com.twu.biblioteca.exception.CouldNotReturnBookException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import com.twu.biblioteca.entity.Book;


public class LibraryControllerTest {
    private LibraryController controller;

    @Before
    public void setup() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Potter e a pedra filosofal", "J.K. Rolling", 1997));
        bookList.add(new Book("Harry Potter camara secreta", "J.K. Rolling", 1999));
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Little Miss Sunshine", "Jonathan Dayton, Valerie Faris", 2006, 5.0));
        movieList.add(new Movie("Into the wild", "Sean Penn", 2008, 5.0));
        controller = new LibraryController(bookList, movieList);
    }

    @Test
    public void testListAllAvailableMethodBringsOnlyAvailable() {
        ArrayList<Book> books = this.controller.listAllAvailableBooks();

        for (Book book : books) {
            Assert.assertEquals(true, book.isAvailable());
        }
    }

    @Test
    public void testGettingBookAtIndex() {
        int expectedIndex = 0;
        Book book = this.controller.getBookAtIndex(expectedIndex);
        Assert.assertEquals("Harry Potter e a pedra filosofal", book.getName());
        Assert.assertEquals("J.K. Rolling", book.getAuthor());

        expectedIndex = 1;
        book = this.controller.getBookAtIndex(expectedIndex);
        Assert.assertEquals("Harry Potter camara secreta", book.getName());
        Assert.assertEquals("J.K. Rolling", book.getAuthor());
    }

    @Test
    public void testCheckingOutABook() {
        try {
            int bookIndex = 0;
            this.controller.checkoutBookAt(bookIndex);
            Assert.assertEquals(1, this.controller.listAllAvailableBooks().size());
        }catch (CouldNotCheckoutBookException e){
            Assert.fail();
        }
    }


    @Test
    public void testGettingAllBooksBooked() {
        this.controller.getBookAtIndex(0).setAvailable(false);
        ArrayList<Book> reservedBooks = this.controller.listAllBorrowedBooks();
        Assert.assertEquals(1, reservedBooks.size());
        Assert.assertEquals("Harry Potter e a pedra filosofal", reservedBooks.get(0).getName());
    }

    @Test
    public void testGettingAllBooksBookedWithLastBookBooked() {
        this.controller.getBookAtIndex(1).setAvailable(false);
        ArrayList<Book> reservedBooks =  this.controller.listAllBorrowedBooks();
        Assert.assertEquals("Harry Potter camara secreta", reservedBooks.get(0).getName());
    }

    @Test
    public void testReturningBookActionSuccessful() {
        this.controller.getBookAtIndex(0).setAvailable(false);
        Book book = this.controller.getBookAtIndex(0);
        try{
            this.controller.returnBook(book);
            Assert.assertEquals(2, this.controller.listAllAvailableBooks().size());
        }catch (CouldNotReturnBookException exception){
            Assert.fail();
        }

    }

    @Test
    public void testRetrieveAllMoviesAvailableInLibrary() {
        ArrayList<Movie> movies = this.controller.listAllAvailableMovies();

        for (Movie movie :  movies) {
            Assert.assertTrue(movie.isAvailable());
        }
    }

    @Test
    public void testGettingMovieAtIndexZero(){
        Movie movie = this.controller.getMovieAt(0);
        Assert.assertEquals("Little Miss Sunshine", movie.getName());
    }

    @Test
    public void testCheckOutMovie() {
        this.controller.checkoutMovieAt(0);
        ArrayList<Movie> movies = this.controller.listAllAvailableMovies();
        Assert.assertEquals(1, movies.size());
        Assert.assertEquals("Into the wild", movies.get(0).getName());
    }
}
