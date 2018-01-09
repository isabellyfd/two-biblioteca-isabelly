package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.CouldNotLoginException;

import java.util.ArrayList;

public class LoginController {
    private ArrayList<User> users;

    public LoginController(ArrayList<User> users){
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
