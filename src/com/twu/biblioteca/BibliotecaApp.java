package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class BibliotecaApp {

    private LibraryController controller;
    private Menu menuController;

    protected BibliotecaApp(ArrayList<Book> books){
        this.controller = new LibraryController(books);
        this.menuController = new Menu(new ListOption(), new CheckoutOption(), new QuitOption());
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

        String command = ConsoleHelper.getUserInput();

        while (isRunning){
            if (app.isCommandAvailable(command)) {
                Option option = app.getOptionFor(command);
                option.action();
            }else {
                ConsoleHelper.printMessage("This option is not available! (try to fix the spelling)");
            }

            app.printMenu();
            command = ConsoleHelper.getUserInput();
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
