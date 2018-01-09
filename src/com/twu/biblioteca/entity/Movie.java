package com.twu.biblioteca.entity;

public class Movie {
    private String name;
    private String director;
    private int year;
    private double rating;
    private boolean isAvailable;

    public Movie(String name, String director, int year, double rating){
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isAvailable = true;
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

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return this.name + " directed by "+ this.director + ", " + this.year + " - " + String.format("%.1f", this.rating) ;
    }

    @Override
    public boolean equals(Object obj) {
        Movie movie = (Movie)obj;
        return this.toString().equals(movie.toString());
    }
}
