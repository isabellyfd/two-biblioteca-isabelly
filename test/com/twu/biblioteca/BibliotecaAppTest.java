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
    public void testIfMenuIsPrinted() {
        app.printMenu();
        Assert.assertEquals("[list-books] shows you all available books in the library\n[checkout] <index> checks out the book in the index passed as argument\n[return] returns a book to library\n[list-movies] list all available movies in the library\n[quit] quits the program", outContent.toString().trim());
    }


    @Test
    public void testUserInputIsQuit() {
        String userInput = "quit";
        Assert.assertTrue(app.isQuitCommand(userInput));
    }
}
