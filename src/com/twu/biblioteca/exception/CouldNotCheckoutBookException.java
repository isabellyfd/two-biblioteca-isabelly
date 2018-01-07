package com.twu.biblioteca.exception;

public class CouldNotCheckoutBookException extends Exception{

    public CouldNotCheckoutBookException(){
        super("That book is not available.");
    }
}
