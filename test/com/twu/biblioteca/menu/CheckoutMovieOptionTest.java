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

    @Test
    public void testIfCheckOutMovieIsNotChosen() {
        String userInput = "checkout-movie";
        CheckoutMovieOption checkoutMovieOption = new CheckoutMovieOption();
        Assert.assertFalse(checkoutMovieOption.check(userInput));
    }
}
