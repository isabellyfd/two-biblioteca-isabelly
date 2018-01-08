package com.twu.biblioteca.entity;

public class Movie {
    private String name;
    private String director;
    private int year;
    private double rating;

    public Movie(String name, String director, int year, double rating){
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getDirector(){
        return this.director;
    }

    public int getYear() {
        return this.year;
    }

    public double getRating() {
        return this.rating;
    }

    @Override
    public String toString() {
        return this.name + " directed by "+ this.director + ", " + this.year + " - " + String.format("%.1f", this.rating) ;
    }
}
