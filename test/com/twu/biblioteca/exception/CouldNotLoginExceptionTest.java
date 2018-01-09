package com.twu.biblioteca.exception;

import org.junit.Assert;
import org.junit.Test;

public class CouldNotLoginExceptionTest {
    @Test
    public void testGettingMessageFromException() {
        CouldNotLoginException exception = new CouldNotLoginException();
        Assert.assertEquals("Password or library number incorrect! try again!", exception.getMessage());
    }
}
