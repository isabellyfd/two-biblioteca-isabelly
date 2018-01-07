package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.exception.CouldNotCheckoutBookException;
import com.twu.biblioteca.util.ConsoleHelper;

public class CheckoutOption extends Option {

    private final String POSITIVE_DECISION = "yes";
    private final String NEGATIVE_DECISION = "no";

    public CheckoutOption() {
        this.setCommand(Commands.CHECKOUT_COMMAND);
        this.setMessage(Commands.CHECKOUT_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        Book book = Facade.shared.getBookAt(--index);
        printCheckoutBookMessage(book);
        String decision = "";
        decision = retrieveRightInputDecision(decision);
        actOnDecision(index, decision);
    }

    private void printCheckoutBookMessage(Book book) {
        ConsoleHelper.printMessage("Do you really want to check you:");
        ConsoleHelper.printMessage(book.toString());
    }

    private void actOnDecision(int index, String decision) {
        if (this.isPositiveDecision(decision)){
            checkoutBookAndPrintMessage(index);
        }else {
            ConsoleHelper.printMessage("Okay then!");
        }
    }

    private void checkoutBookAndPrintMessage(int index) {
        try {
            Facade.shared.checkoutBookAt(index);
            ConsoleHelper.printMessage("Thank you! Enjoy the book.");
        }catch (CouldNotCheckoutBookException exception){
            ConsoleHelper.printMessage(exception.getMessage());
        }
    }

    private String retrieveRightInputDecision(String decision) {
        while(this.isNotTheRightCommand(decision)){
            ConsoleHelper.printMessage("yes or no?");
            decision = ConsoleHelper.getUserInput().getCommand();
        }
        return decision;
    }

    protected boolean isPositiveDecision(String decision){
        return POSITIVE_DECISION.equals(decision.toLowerCase());
    }

    protected boolean isNegativeDecision(String decision){
        return NEGATIVE_DECISION.equals(decision.toLowerCase());
    }

    private boolean isNotTheRightCommand(String command){
        return (!this.isPositiveDecision(command) && !this.isNegativeDecision(command));
    }

}
