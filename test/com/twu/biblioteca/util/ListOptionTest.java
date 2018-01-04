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
}