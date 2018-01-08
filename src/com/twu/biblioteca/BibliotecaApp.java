package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Input;

import java.util.ArrayList;

public class BibliotecaApp {

    private Menu menuController;

    protected BibliotecaApp(ArrayList<Book> books){
        this.menuController = new Menu(new ListOption(), new CheckoutOption(), new ReturnOption(), new QuitOption());
    }

    public static BibliotecaApp getInstance() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));
        return new BibliotecaApp(books);
    }

    public static void main(String[] args) {
        runLibrary();
    }

    private static void runLibrary() {
        BibliotecaApp app = BibliotecaApp.getInstance();
        boolean isRunning = true;
        app.printWelcomeMessage();

        app.printMenu();

        Input userInput = ConsoleHelper.getUserInput();

        while (isRunning){
            if (app.isCommandAvailable(userInput.getCommand())) {
                Option option = app.getOptionFor(userInput.getCommand());
                option.action(userInput.getArgument());
            }else {
                ConsoleHelper.printMessage("Select a valid option!");
                ConsoleHelper.printMessage("");
            }
            app.printMenu();
            userInput = ConsoleHelper.getUserInput();
        }
    }

    public void printWelcomeMessage(){
        ConsoleHelper.printMessage(ConsoleHelper.welcomeMessage());
    }

    public void printMenu() {
        this.menuController.printMenu();
    }

    public boolean isQuitCommand(String command) {
        return this.menuController.getOptionFor(command).check(Commands.QUIT_COMMAND);
    }

    public boolean isCommandAvailable(String command){
        return this.menuController.isCommandAvailable(command);
    }

    public Option getOptionFor(String command){
        return this.menuController.getOptionFor(command);
    }
}
