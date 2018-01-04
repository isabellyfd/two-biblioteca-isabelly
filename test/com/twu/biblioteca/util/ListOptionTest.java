package com.twu.biblioteca.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

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
        Assert.assertEquals("[list] shows you all avaliable books in the library", this.listOption.getMessage());
    }
}
