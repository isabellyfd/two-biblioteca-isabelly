package com.twu.biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaAppTest {

    private static final ByteArrayOutputStream outContent =  new ByteArrayOutputStream();
    private BibliotecaApp app;

    @BeforeClass
    public static void setupStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @Before
    public void setup(){
        app = new BibliotecaApp();
    }


    @Test
    public void testIfPrintedWelcomeMessageWhenCalledPrintWelcomeMethod() {
        app.printWelcomeMessage();
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!\n", outContent.toString());
    }
}
