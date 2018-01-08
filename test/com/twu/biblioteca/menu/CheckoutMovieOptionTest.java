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
        String userInput = "checkout-moie";
        CheckoutMovieOption checkoutMovieOption = new CheckoutMovieOption();
        Assert.assertFalse(checkoutMovieOption.check(userInput));
    }

    @Test
    public void testGettingMessageOfCheckingOutMovie() {
        CheckoutMovieOption checkoutMovieOption = new CheckoutMovieOption();
        Assert.assertEquals("[checkout-movie] <index> checks out the movie in the index passed as argument", checkoutMovieOption.getMessage());
    }
}
