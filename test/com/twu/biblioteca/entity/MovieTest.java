package com.twu.biblioteca.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
    private Movie movie;

    @Before
    public void setup() {
        this.movie = new Movie("Little Miss Sunshine", "Jonathan Dayton, Valerie Faris", 2006, 5.0);
    }

    @Test
    public void testMovieCreation() {
        Assert.assertEquals("Little Miss Sunshine", movie.getName());
        Assert.assertEquals("Jonathan Dayton, Valerie Faris", movie.getDirector());
        Assert.assertEquals(2006, movie.getYear());
        Assert.assertEquals(5.0, movie.getRating(), 0.0);
    }

    @Test
    public void testingToStringReturn(){
        Assert.assertEquals("Little Miss Sunshine directed by Jonathan Dayton, Valerie Faris, 2006 - 5.0", movie.toString());
    }

    @Test
    public void testingEqualityOfObjectsr() {
        Movie anotherMovie = new Movie("Little Miss Sunshine", "Jonathan Dayton, Valerie Faris", 2006, 5.0);
        Assert.assertTrue(anotherMovie.equals(movie));
    }


}
