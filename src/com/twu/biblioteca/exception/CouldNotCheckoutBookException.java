package com.twu.biblioteca.exception;

public class CouldNotCheckoutBookException extends Exception{

    public CouldNotCheckoutBookException(){
        super("This book is not available!");
    }
}
