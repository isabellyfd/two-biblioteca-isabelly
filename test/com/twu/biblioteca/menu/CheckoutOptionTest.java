package com.twu.biblioteca.menu;


import org.junit.Assert;
import org.junit.Test;

public class CheckoutOptionTest {

    @Test
    public void testIfCheckOutOptionIsChosen() {
        String userInput =  "checkout";
        CheckoutOption checkoutOption = new CheckoutOption();
        Assert.assertTrue(checkoutOption.check(userInput));
    }
}
