package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.CouldNotLoginException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LoginControllerTest {

    private LoginController controller;

    @Before
    public void setup() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Isabelly", "icfd@example.com", "(81) 998061240", "123-4567", "bellypass"));
        users.add(new User("Carol", "ccar@example.com", "(81) 998061240", "123-1111", "carolpass"));
        this.controller = new LoginController(users);
    }

    @Test
    public void testingLoginCorrectLibraryNumber() {

        try {
            User loginUser = controller.login("123-4567", "bellypass");
            Assert.assertNotNull(loginUser);
            Assert.assertEquals("icfd@example.com", loginUser.getEmail());
        } catch (CouldNotLoginException e) {
            Assert.fail();
        }
    }

    @Test
    public void testingThrowingExceptionWhenPassIsWrong() {
        try{
            User loginUSer = controller.login("123-4567", "heuehueh");
            Assert.fail();
        }catch (CouldNotLoginException e){
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void testingThrowingExceptionWhenLibraryNumberIsWrong() {
        try{
            User loginUSer = controller.login("123-4237", "bellypass");
            Assert.fail();
        }catch (CouldNotLoginException e){
            Assert.assertNotNull(e);
        }
    }
}
