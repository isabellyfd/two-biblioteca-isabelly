package com.twu.biblioteca.exception;

import org.junit.Assert;
import org.junit.Test;

public class CouldNotReturnBookExceptionTest {

    @Test
    public void testGettingMessageFromException() {
        CouldNotReturnBookException exception = new CouldNotReturnBookException();
        Assert.assertEquals("That is not a valid book to return.", exception.getMessage());
    }
}
