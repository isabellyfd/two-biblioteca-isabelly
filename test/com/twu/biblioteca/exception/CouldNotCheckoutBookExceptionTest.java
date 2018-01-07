package com.twu.biblioteca.exception;

import org.junit.Assert;
import org.junit.Test;

public class CouldNotCheckoutBookExceptionTest {

    @Test
    public void testIfMessageOfExceptionIsCorrect() {
        CouldNotCheckoutBookException exception = new CouldNotCheckoutBookException();
        Assert.assertEquals("That book is not available.", exception.getMessage());
    }
}
