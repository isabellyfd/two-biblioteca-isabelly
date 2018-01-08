package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Test;

public class CheckoutMovieOptionTest {

    @Test
    public void testIfCheckOutMovieIsChosen() {
        String userInput = "checkout-movie";
        CheckoutMovieOption checkoutMovieOption = new CheckoutMovieOption();
        Assert.assertTrue(checkoutMovieOption.check(userInput));
    }
}
