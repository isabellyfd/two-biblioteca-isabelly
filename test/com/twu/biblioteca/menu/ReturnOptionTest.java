package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Test;

public class ReturnOptionTest {

    @Test
    public void testIfIsChosenOptionIsReturn() {
        String userInput = "return-book";
        ReturnOption returnOption = new ReturnOption();
        Assert.assertTrue(returnOption.check(userInput));
    }

    @Test
    public void testIfISNotChosenReturnOption() {
        String userInput = "ret";
        ReturnOption returnOption = new ReturnOption();
        Assert.assertFalse(returnOption.check(userInput));

    }

    @Test
    public void testGettingMessageFromReturnOption() {
        ReturnOption returnOption = new ReturnOption();
        Assert.assertEquals("[return-book] returns a book to library", returnOption.getMessage());
    }
}
