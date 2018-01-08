package com.twu.biblioteca.exception;

public class CouldNotReturnBookException extends Exception {

    public CouldNotReturnBookException(){
        super("That is not a valid book to return.");
    }
}
