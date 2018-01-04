package com.twu.biblioteca.util;

public class ListOption {

    private final String COMMAND = "list";

    protected boolean check(String userInput){
        return COMMAND.equals(userInput);
    }
}
