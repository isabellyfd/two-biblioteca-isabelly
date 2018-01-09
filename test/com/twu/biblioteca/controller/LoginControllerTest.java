package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.CouldNotLoginException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LoginControllerTest {

    @Test
    public void testingLoginCorrectLibraryNumber() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Isabelly", "icfd@example.com", "(81) 998061240", "123-4567", "bellypass"));
        users.add(new User("Carol", "ccar@example.com", "(81) 998061240", "123-1111", "carolpass"));
        LoginController controller = new LoginController(users);
        try {
            User loginUser = controller.login("123-4567", "bellypass");
            Assert.assertNotNull(loginUser);
            Assert.assertEquals("icfd@example.com", loginUser.getEmail());
        }catch(CouldNotLoginException e){
            Assert.fail();
        }
    }
    
}
