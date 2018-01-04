package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import com.twu.biblioteca.util.ConsoleHelper;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class ConsoleHelperTest {

    private static final ByteArrayOutputStream outContent =  new ByteArrayOutputStream();

    @BeforeClass
    public static void setupStreams(){
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void testPrintWelcomeMessageCorrectly() {
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!\n", ConsoleHelper.welcomeMessage());
    }

    @Test
    public void testPrintAllElementsOfTheListFormattedWithToString() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        ConsoleHelper.printList(books);
        Assert.assertEquals("1 - Goodnight Moon by Margaret Wise Brown, Clement Hurd - 2007", outContent.toString().trim());
        Assert.assertEquals("2 - Press Here by Herve Tullet - 2011", outContent.toString().trim());
    }
}
