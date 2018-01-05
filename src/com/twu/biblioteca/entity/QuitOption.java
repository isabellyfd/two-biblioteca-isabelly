package com.twu.biblioteca.entity;

public class QuitOption extends Option {

    private final String MESSAGE = "[quit] quits the program";

    public QuitOption(){
        this.setCOMMAND(Commands.QUIT_COMMAND);
    }

    public boolean check(String userInput){
        return this.getCOMMAND().equals(userInput);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
