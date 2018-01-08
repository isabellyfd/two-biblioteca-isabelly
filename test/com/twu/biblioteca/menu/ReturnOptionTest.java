package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Test;

public class ReturnOptionTest {

    @Test
    public void testIsChosenOptionIsReturn() {
        String userInput = "return";
        ReturnOption returnOption = new ReturnOption();
        Assert.assertTrue(returnOption.check(userInput));
    }
}
