package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class ListMoviesOption extends Option {

    public ListMoviesOption() {
        this.setCommand(Commands.LIST_MOVIES_COMMAND);
        this.setMessage(Commands.LIST_MOVIES_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        ArrayList<Movie> movies = Facade.shared.getAllAvailableMovies();

        for (Movie movie: movies){
            ConsoleHelper.shared.printMessage(movie.toString());
        }
    }
}
