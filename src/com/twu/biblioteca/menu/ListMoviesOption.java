package com.twu.biblioteca.menu;

public class ListMoviesOption extends Option {

    public ListMoviesOption() {
        this.setCommand(Commands.LIST_MOVIES_COMMAND);
        this.setMessage(Commands.LIST_MOVIES_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        System.out.println("list movies");
    }
}
