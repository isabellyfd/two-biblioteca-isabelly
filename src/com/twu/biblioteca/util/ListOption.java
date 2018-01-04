package com.twu.biblioteca.util;

public class ListOption {

    private final String COMMAND = "list";

    public boolean check(String userInput){
        return COMMAND.equals(userInput);
    }

    public String getMessage(){
        return "";
    }

}
