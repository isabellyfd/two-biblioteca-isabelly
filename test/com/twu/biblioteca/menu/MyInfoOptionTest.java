package com.twu.biblioteca.menu;

import com.twu.biblioteca.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class MyInfoOptionTest {

    @Test
    public void testIfMyInfoOptionIsChosen(){
        String userInput = "my-info";
        User myUser = new User("Isabelly Damascena", "icfd@example.com", "(81) 998061240", "000-0001", "bellypass");
        MyInfoOption myInfoOption = new MyInfoOption(myUser);
        Assert.assertTrue(myInfoOption.check(userInput));
    }
}
