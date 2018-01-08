package com.twu.biblioteca.menu;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ListBooksOptionTest {

    private ListBooksOption listOption;

    @Before
    public void setup() {
        this.listOption = new ListBooksOption();
    }

    @Test
    public void testIfIsChosenListOption() {
        String userInput = "list-books";
        Assert.assertTrue(this.listOption.check(userInput));
    }

    @Test
    public void testIfIsNotChosenListOption() {
        String userInput =  "lits";
        Assert.assertFalse(this.listOption.check(userInput));
    }

    @Test
    public void testGettingMessageFromListOption() {
        Assert.assertEquals("[list-books] shows you all available books in the library", this.listOption.getMessage());
    }
}
