package com.twu.biblioteca.util;

import com.twu.biblioteca.entity.Book;
import org.junit.*;
import com.twu.biblioteca.util.ConsoleHelper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class ConsoleHelperTest {

    private final ByteArrayOutputStream outContent =  new ByteArrayOutputStream();

    @Before
    public void setup(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void teardown(){
        System.setOut(null);
    }


    @Test
    public void testPrintWelcomeMessageCorrectly() {
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!\n", ConsoleHelper.shared.welcomeMessage());
    }

    @Test
    public void testPrintAllElementsOfTheListFormattedWithToString() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        ConsoleHelper.shared.printList(books);
        Assert.assertEquals("1 - Goodnight Moon by Margaret Wise Brown, Clement Hurd - 2007\n2 - Press Here by Herve Tullet - 2011", outContent.toString().trim());
    }

    @Test
    public void testPrintMessageMethod(){
        String message = "Oi amiguinho!";
        ConsoleHelper.shared.printMessage(message);
        Assert.assertEquals("Oi amiguinho!", outContent.toString().trim());
    }

    @Test
    public void testGettingUserInput() {
        String expectedInput = "list";
        ByteArrayInputStream inContent = new ByteArrayInputStream(expectedInput.getBytes());
        System.setIn(inContent);
        String userInput = ConsoleHelper.getUserInput().getCommand();
        Assert.assertEquals(expectedInput, userInput);
        System.setIn(null);
    }

    @Test
    public void testParsingMethodUsingCheckoutInput(){
        String userInput = "checkout 2";
        Input input = ConsoleHelper.parseInput(userInput);
        Assert.assertEquals("checkout", input.getCommand());
        Assert.assertEquals(2, input.getArgument());
    }

    @Test
    public void testParsingMethodUsingListInput() {
        String userInput = "list";
        Input input = ConsoleHelper.parseInput(userInput);
        Assert.assertEquals(userInput, input.getCommand());
        Assert.assertEquals(-1, input.getArgument());
    }
}
