package com.twu.biblioteca.entity;

public class ListOption extends Option {


    private final String MESSAGE = "[list] shows you all available books in the library";

    public ListOption() {
        this.setCOMMAND(Commands.LIST_COMMAND);
    }

    public boolean check(String userInput){
        return this.getCOMMAND().equals(userInput);
    }

    public String getMessage(){
        return MESSAGE;
    }

}
