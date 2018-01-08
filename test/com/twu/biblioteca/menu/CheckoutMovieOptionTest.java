package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutMovieOptionTest {

    private CheckoutMovieOption checkoutMovieOption;

    @Before
    public void setup() {
        checkoutMovieOption = new CheckoutMovieOption();
    }

    @Test
    public void testIfCheckOutMovieIsChosen() {
        String userInput = "checkout-movie";
        Assert.assertTrue(checkoutMovieOption.check(userInput));
    }

    @Test
    public void testIfCheckOutMovieIsNotChosen() {
        String userInput = "checkout-moie";
        Assert.assertFalse(checkoutMovieOption.check(userInput));
    }

    @Test
    public void testGettingMessageOfCheckingOutMovie() {
        Assert.assertEquals("[checkout-movie] <index> checks out the movie in the index passed as argument", checkoutMovieOption.getMessage());
    }

    @Test
    public void testDecisionIsYesLowerCase() {
        String userInput = "yes";
        Assert.assertTrue(checkoutMovieOption.isPositiveDecision(userInput));
    }

    @Test
    public void testDecisionIsYesUpperCase() {
        String userInput = "YES";
        Assert.assertTrue(checkoutMovieOption.isPositiveDecision(userInput));
    }

    @Test
    public void testDecisionIsNoLowerCase() {
        String userInput = "no";
        Assert.assertTrue(checkoutMovieOption.isNegativeDecision(userInput));
    }

    @Test
    public void testDecisionInNoUpperCase() {
        String userInput ="NO";
        Assert.assertTrue(checkoutMovieOption.isNegativeDecision(userInput));
    }
}
