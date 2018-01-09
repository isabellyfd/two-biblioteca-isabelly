package com.twu.biblioteca.menu;

import com.twu.biblioteca.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyInfoOptionTest {

    private MyInfoOption myInfoOption;
    @Before
    public void setup() {
        User myUser = new User("Isabelly Damascena", "icfd@example.com", "(81) 998061240", "000-0001", "bellypass");
        this.myInfoOption = new MyInfoOption(myUser);
    }

    @Test
    public void testIfMyInfoOptionIsChosen(){
        String userInput = "my-info";
        Assert.assertTrue(myInfoOption.check(userInput));
    }

    @Test
    public void testGettingMyInfoOptionCommand() {
        Assert.assertEquals("[my-info] show all information about you", myInfoOption.getMessage());
    }
}
