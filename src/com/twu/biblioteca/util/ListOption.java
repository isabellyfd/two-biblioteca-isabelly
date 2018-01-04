package com.twu.biblioteca.util;

public class ListOption {

    private final String COMMAND = "list";
    private final String MESSAGE = "[list] shows you all available books in the library";

    public boolean check(String userInput){
        return COMMAND.equals(userInput);
    }

    public String getMessage(){
        return MESSAGE;
    }

}
