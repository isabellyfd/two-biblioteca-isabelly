package com.twu.biblioteca.menu;

public class CheckoutOption extends Option {

    public CheckoutOption() {
        this.setCommand("checkout");
        this.setMessage("[checkout] <index> checks out the book in the index passed as argument.");
    }

    @Override
    public void action() {

    }
}
