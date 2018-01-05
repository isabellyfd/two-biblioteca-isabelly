package com.twu.biblioteca.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;



public class QuitOptionTest {

    private QuitOption quitOption;

    @Before
    public void setup() {
        this.quitOption = new QuitOption();
    }

    @Test
    public void testIfChoosenOptionIsQuitOption() {
        String userInput = "quit";
        Assert.assertTrue(this.quitOption.check(userInput));
    }

}
