package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.util.ConsoleHelper;

public class CheckoutMovieOption extends Option {
    public CheckoutMovieOption() {
        this.setCommand(Commands.CHECKOUT_MOVIE_COMMAND);
        this.setMessage(Commands.CHECKOUT_MOVIE_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        Movie movie = Facade.shared.getMovieAt(--index);
        printCheckoutMovieMessage(movie);
        String decision = retrieveRightInputDecision();

        actOnDecision(index, decision);
    }

    private void actOnDecision(int index, String decision) {
        if (this.isPositiveDecision(decision)){
            checkoutAndPrintMessage(index);
        }else {
            ConsoleHelper.shared.printMessage("Okay Then!");
        }
    }

    private void checkoutAndPrintMessage(int index) {
        Facade.shared.checkoutMovieAt(index);
        ConsoleHelper.shared.printMessage("Checkout done!");
    }

    private String retrieveRightInputDecision() {
        String decision = "";

        while (isNotTheRightCommand(decision)){
            ConsoleHelper.shared.printMessage("yes or no?");
            decision = ConsoleHelper.shared.getUserInput().getCommand();
        }
        return decision;
    }

    private void printCheckoutMovieMessage(Movie movie) {
        ConsoleHelper.shared.printMessage("Do you really want to check out:");
        ConsoleHelper.shared.printMessage(movie.toString());
    }

    protected boolean isPositiveDecision(String userInput){
        return Decisions.POSITIVE_DECISION.equals(userInput.toLowerCase());
    }

    protected boolean isNegativeDecision(String userInput){
        return Decisions.NEGATIVE_DECISION.equals(userInput.toLowerCase());
    }

    private boolean isNotTheRightCommand(String command) {
        return (!this.isNegativeDecision(command) && !this.isPositiveDecision(command));
    }
}
