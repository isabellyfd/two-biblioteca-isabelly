package com.twu.biblioteca.exception;

public class CouldNotLoginException  extends Exception{

    public CouldNotLoginException() {
        super("Password or library number incorrect! try again!");
    }
}
