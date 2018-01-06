package com.twu.biblioteca.menu;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.menu.ListOption;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class ListOptionTest {

    private ListOption listOption;

    @Before
    public void setup() {
        this.listOption = new ListOption();
    }

    @Test
    public void testIfIsChosenListOption() {
        String userInput = "list";
        Assert.assertTrue(this.listOption.check(userInput));
    }

    @Test
    public void testIfIsNotChosenListOption() {
        String userInput =  "lits";
        Assert.assertFalse(this.listOption.check(userInput));
    }

    @Test
    public void testGettingMessageFromListOption() {
        Assert.assertEquals("[list] shows you all available books in the library", this.listOption.getMessage());
    }
}
