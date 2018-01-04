package com.twu.biblioteca.util;

import org.junit.Test;
import org.junit.Assert;
import com.twu.biblioteca.util.ConsoleHelper;

public class ConsoleHelperTest {

    @Test
    public void testPrintWelcomeMessageCorrectly() {
        Assert.assertEquals("Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!", ConsoleHelper.welcomeMessage());
    }
}
