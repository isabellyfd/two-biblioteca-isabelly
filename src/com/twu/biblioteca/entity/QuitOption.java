package com.twu.biblioteca.entity;

public class QuitOption {

    private final String COMMAND = "quit";
    private final String MESSAGE = "[quit] quits the program";

    public boolean check(String userInput){
        return COMMAND.equals(userInput);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
