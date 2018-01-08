package com.twu.biblioteca.menu;

public class ListMoviesOption extends Option {

    public ListMoviesOption() {
        this.setCommand(Commands.LIST_MOVIES_COMMAND);
        this.setMessage("[list-movies] list all movies available in the library");
    }

    @Override
    public void action(int index) {
        System.out.println("list movies");
    }
}
