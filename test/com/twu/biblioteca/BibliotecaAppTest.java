package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaAppTest {

    private static final ByteArrayOutputStream outContent =  new ByteArrayOutputStream();
    private BibliotecaApp app;

    @Before
    public void setup(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        app = new BibliotecaApp(books);

        System.setOut(new PrintStream(outContent));
    }


    @After
    public void teardown() {
        outContent.reset();
        System.setOut(null);
    }

    @Test
    public void testIfPrintedWelcomeMessageWhenCalledPrintWelcomeMethod() {
        app.printWelcomeMessage();
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!", outContent.toString().trim());
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

    @Test
    public void testIfAllBooksWerePrinted() {
        app.printAllBooksAvailable();
        Assert.assertEquals("1 - Goodnight Moon by Margaret Wise Brown, Clement Hurd - 2007\n2 - Press Here by Herve Tullet - 2011", outContent.toString().trim());
    }

    @Test
    public void testIfMenuIsPrinted() {
        app.printMenu();
        Assert.assertEquals("[list] shows you all available books in the library", outContent.toString().trim());
    }
}
