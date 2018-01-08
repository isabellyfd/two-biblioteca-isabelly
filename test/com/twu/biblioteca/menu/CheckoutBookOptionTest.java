package com.twu.biblioteca.menu;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutBookOptionTest {

    private CheckoutBookOption checkoutOption;
    @Before
    public void setup() {
        this.checkoutOption = new CheckoutBookOption();
    }

    @Test
    public void testIfCheckoutOptionIsChosen() {
        String userInput = "checkout";
        Assert.assertTrue(checkoutOption.check(userInput));
    }


    @Test
    public void testIdCheckoutOptionIsNotChosen() {
        String userInput = "check";
        Assert.assertFalse(checkoutOption.check(userInput));
    }

    @Test
    public void testGettingMessageFromCheckoutOption() {
        Assert.assertEquals("[checkout] <index> checks out the book in the index passed as argument", checkoutOption.getMessage());
    }

    @Test
    public void testIfDecisionIsYesInCheckoutBook() {
        String userDecision = "yes";
        Assert.assertTrue(this.checkoutOption.isPositiveDecision(userDecision));
    }

    @Test
    public void testIfDecisionIsYesInCheckoutBookUsingCapsLock() {
        String userDecision = "YES";
        Assert.assertTrue(this.checkoutOption.isPositiveDecision(userDecision));
    }

    @Test
    public void testIfDecisionIsNoInCheckOutBook() {
        String userDecision = "no";
        Assert.assertTrue(this.checkoutOption.isNegativeDecision(userDecision));
    }

    @Test
    public void testIfDecisionIFConInCheckOutBookUsingCapsLock() {
        String userDecision = "NO";
        Assert.assertTrue(this.checkoutOption.isNegativeDecision(userDecision));
    }
}
