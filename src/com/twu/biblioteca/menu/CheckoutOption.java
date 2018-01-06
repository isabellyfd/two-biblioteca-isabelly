package com.twu.biblioteca.menu;

public class CheckoutOption extends Option {

    public CheckoutOption() {
        this.setCommand(Commands.CHECKOUT_COMMAND);
        this.setMessage(Commands.CHECKOUT_COMMAND_MESSAGE);
    }

    @Override
    public void action() {

    }
}
