package com.twu.biblioteca.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListMoviesOptionTest {

    private ListMoviesOption listMoviesOption;

    @Before
    public void setup() {
        this.listMoviesOption = new ListMoviesOption();
    }

    @Test
    public void testIfUserChoiceWasListMovies() {
        String userInput = "list-movies";
        Assert.assertTrue(listMoviesOption.check(userInput));
    }

    @Test
    public void testIfUserChoiceWasNotListMovies() {
        String userInput = "list-movie";
        Assert.assertFalse(listMoviesOption.check(userInput));
    }

    @Test
    public void testGettingMessageFromListMovieOption() {
        
        Assert.assertEquals("[list-movies] list all movies available in the library", listMoviesOption.getMessage());
    }

}
