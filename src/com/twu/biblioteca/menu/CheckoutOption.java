package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;

public class CheckoutOption extends Option {

    private final String POSITIVE_DECISION = "yes";

    public CheckoutOption() {
        this.setCommand(Commands.CHECKOUT_COMMAND);
        this.setMessage(Commands.CHECKOUT_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        Book book = Facade.shared.getBookAt(--index);

        ConsoleHelper.printMessage("Do you realy want to check you:");
        ConsoleHelper.printMessage(book.toString());
        ConsoleHelper.printMessage("yes or no?\n");

        String decision = ConsoleHelper.getUserInput();
    }

    protected boolean isPositiveDecision(String decision){
        return POSITIVE_DECISION.equals(decision.toLowerCase());
    }

    protected boolean isNegativeDecision(String decision){
        return false;
    }

}
