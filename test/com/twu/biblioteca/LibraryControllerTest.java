package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.Entity.Book;


public class LibraryControllerTest {
    private LibraryController controller;

    @Before
    public void setup() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Book> bookList = new ArrayList<Book>();

        try {
            bookList.add(new Book("Harry Potter e a pedra filosofal", "J.K. Rolling", dateFormat.parse("31/06/1997")));
            bookList.add(new Book("Harry Potter camara secreta", "J.K. Rolling", dateFormat.parse("31/06/1999")));
            
        }catch(ParseException e){
            Assert.fail();
        }

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

        for(Book book : books){
            Assert.assertEquals(true, book.isAvailable());
        }
   }
}
