package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.CouldNotLoginException;

import java.util.ArrayList;

public class LoginController {
    private ArrayList<User> users;

    public LoginController createControllerWithUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Isabelly Damascena", "icfd@example.com", "(81) 998061240", "000-0001", "bellypass"));
        users.add(new User("Caio Souza", "cbs@example.com", "(81) 998061240", "000-0002", "caiopass"));
        users.add(new User("Wagner Palacio", "wp@example.com", "(81) 998061240", "000-0003", "wagnerpass"));

        return new LoginController(users);
    }

    protected LoginController(ArrayList<User> users){
        this.users = users;
    }

    public User login(String libraryNumber, String password) throws CouldNotLoginException{
        for(User user : this.users){
            if(matchLibraryNumberAndPasswordForUser(libraryNumber,password,user)){
                return user;
            }
        }
        throw new CouldNotLoginException();
    }

    public boolean matchLibraryNumberAndPasswordForUser(String libraryNumber, String password, User user){
        return user.checkLibraryNumber(libraryNumber) && user.checkPassword(password);
    }
}
