package com.twu.biblioteca.menu;

public class ListOption extends Option {

    public ListOption() {
        this.setCommand(Commands.LIST_COMMAND);
        this.setMessage(Commands.LIST_COMMAND_MESSAGE);
    }
}