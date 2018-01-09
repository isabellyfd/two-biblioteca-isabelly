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

        ConsoleHelper.shared.printMessage("Do you really want to check out:");
        ConsoleHelper.shared.printMessage(movie.toString());

        String decision = "";

        while (isNotTheRightCommand(decision)){
            ConsoleHelper.shared.printMessage("yes or no?");
            decision = ConsoleHelper.shared.getUserInput().getCommand();
        }

        if (this.isPositiveDecision(decision)){
            ConsoleHelper.shared.printMessage("checkout movie");
        }else {
            ConsoleHelper.shared.printMessage("Okay Then!");
        }
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
