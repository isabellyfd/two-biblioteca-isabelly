package com.twu.biblioteca.entity;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testingToStringFormat(){
        User user = new User("Isabelly", "icfd@example.com", "(81) 998061240", "123-4567", "bellypass");
        Assert.assertEquals("Name: Isabelly\nEmail: icfd@example.com\nPhone: (81)998061240", user.toString());
    }
}
