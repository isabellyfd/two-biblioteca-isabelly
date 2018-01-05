package com.twu.biblioteca.entity;

public class ListOption extends Option {

    public ListOption() {
        this.setCommand(Commands.LIST_COMMAND);
        this.setMessage(Commands.LIST_COMMAND_MESSAGE);
    }

    public boolean check(String userInput){
        return this.getCommand().equals(userInput);
    }
}
