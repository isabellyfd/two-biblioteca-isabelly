package com.twu.biblioteca.entity;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void testMovieCreation() {
        Movie movie = new Movie("Little Miss Sunshine", "Jonathan Dayton, Valerie Faris", 2006, 5.0);
        Assert.assertEquals("Little Miss Sunshine", movie.getName());
        Assert.assertEquals("Jonathan Dayton, Valerie Faris", movie.getDirector());
        Assert.assertEquals(2006, movie.getYear());
        Assert.assertEquals(5.0, movie.getRating(), 0.0);
    }
}
