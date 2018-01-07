package com.twu.biblioteca.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.exception.CouldNotCheckoutBookException;


public class LibraryControllerTest {
    private LibraryController controller;

    @Before
    public void setup() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Harry Potter e a pedra filosofal", "J.K. Rolling", 1997));
        bookList.add(new Book("Harry Potter camara secreta", "J.K. Rolling", 1999));
        controller = new LibraryController(bookList);
    }

    @Test
    public void testGettingAllBooksFromLibrary() {
        ArrayList<Book> books = this.controller.getBookList();

        Assert.assertNotNull(books);
        Assert.assertEquals(2, books.size());
        Assert.assertEquals("Harry Potter e a pedra filosofal", books.get(0).getName());
        Assert.assertEquals("Harry Potter camara secreta", books.get(1).getName());
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
        }catch (CouldNotCheckoutBookException e){
            Assert.fail();
        }
    }
}
