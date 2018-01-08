package com.twu.biblioteca.menu;

public class CheckoutMovieOption extends Option {

    public CheckoutMovieOption() {
        this.setCommand(Commands.CHECKOUT_MOVIE_COMMAND);
        this.setMessage("[checkout-movie] <index> checks out the movie in the index passed as argument");
    }

    @Override
    public void action(int index) {

    }
}
