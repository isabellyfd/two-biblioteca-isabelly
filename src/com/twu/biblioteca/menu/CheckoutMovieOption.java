package com.twu.biblioteca.menu;

public class CheckoutMovieOption extends Option {

    public CheckoutMovieOption() {
        this.setCommand(Commands.CHECKOUT_MOVIE_COMMAND);
        this.setMessage(Commands.CHECKOUT_MOVIE_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {

    }
}
