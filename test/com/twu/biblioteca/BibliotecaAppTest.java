package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaAppTest {

    private static final ByteArrayOutputStream outContent =  new ByteArrayOutputStream();
    private BibliotecaApp app;

    @BeforeClass
    public static void setupStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @Before
    public void setup(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        app = new BibliotecaApp(books);
    }


    @Test
    public void testIfPrintedWelcomeMessageWhenCalledPrintWelcomeMethod() {
        app.printWelcomeMessage();
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!\n", outContent.toString());
    }

    @Test
    public void testIfAllBookWereRecovered(){
        ArrayList<Book> booksInLibrary = app.getBooksInLibrary();

        Assert.assertNotNull(booksInLibrary);
        Assert.assertEquals(2, booksInLibrary.size());
        Assert.assertEquals("Goodnight Moon", booksInLibrary.get(0).getName());
        Assert.assertEquals("Margaret Wise Brown, Clement Hurd", booksInLibrary.get(0).getAuthor());
        Assert.assertEquals(2007, booksInLibrary.get(0).getPublishYear());

        Assert.assertEquals("Press Here", booksInLibrary.get(1).getName());
        Assert.assertEquals("Herve Tullet", booksInLibrary.get(1).getAuthor());
        Assert.assertEquals(2011, booksInLibrary.get(1).getPublishYear());
    }
}
