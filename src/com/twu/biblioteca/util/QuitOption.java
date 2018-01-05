package com.twu.biblioteca.util;

public class QuitOption {

    private final String COMMAND = "quit";

    public boolean check(String userInput){
        return COMMAND.equals(userInput);
    }

    public String getMessage() {
        return "";
    }
}
