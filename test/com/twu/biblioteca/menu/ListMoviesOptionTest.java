package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Test;

public class ListMoviesOptionTest {

    @Test
    public void testIfUserChoiceWasListMovies() {
        String userInput = "list-movies";
        ListMoviesOption listMoviesOption =  new ListMoviesOption();
        Assert.assertTrue(listMoviesOption.check(userInput));
    }

    @Test
    public void testIfUserChoiceWasNotListMovies() {
        String userInput = "list-movie";
        ListMoviesOption listMoviesOption = new ListMoviesOption();
        Assert.assertFalse(listMoviesOption.check(userInput));
    }

}
