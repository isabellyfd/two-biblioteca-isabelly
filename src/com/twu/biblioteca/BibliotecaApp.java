package com.twu.biblioteca;

import com.twu.biblioteca.controller.LoginController;
import com.twu.biblioteca.controller.Menu;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.CouldNotLoginException;
import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.menu.constants.Commands;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.Input;

import java.util.ArrayList;

public class BibliotecaApp {

    private Menu menuController;
    private LoginController loginController;

    protected BibliotecaApp(ArrayList<Book> books){
        this.menuController = new Menu(new ListBooksOption(), new CheckoutBookOption(), new ReturnOption(), new ListMoviesOption(), new CheckoutMovieOption(), new QuitOption());
        this.loginController = LoginController.createControllerWithUsers();
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

        ConsoleHelper.shared.printMessage("For entering in the library system you need to login!!");

        User user = null;
        while(didNotLogged(user)){
            ConsoleHelper.shared.printMessage("Enter library number:");
            String libraryNumber = ConsoleHelper.shared.getUserInput().getCommand();

            ConsoleHelper.shared.printMessage("Enter password:");
            String password = ConsoleHelper.shared.getUserInput().getCommand();
            user = app.login(libraryNumber, password);
        }

        app.addNewOption(user);

        boolean isRunning = true;
        app.printWelcomeMessage();
        app.printMenu();

        Input userInput = ConsoleHelper.shared.getUserInput();

        while (isRunning){
            if (app.isCommandAvailable(userInput.getCommand())) {
                Option option = app.getOptionFor(userInput.getCommand());
                option.action(userInput.getArgument());
            }else {
                ConsoleHelper.shared.printMessage("Select a valid option!");
                ConsoleHelper.shared.printMessage("");
            }
            app.printMenu();
            userInput = ConsoleHelper.shared.getUserInput();
        }
    }

    private static boolean didNotLogged(User user) {
        return user == null;
    }

    public void printWelcomeMessage(){
        ConsoleHelper.shared.printMessage(ConsoleHelper.shared.welcomeMessage());
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

    public User login(String libraryNumber, String password){
        User loggedUser = null;
        try{
             loggedUser = this.loginController.login(libraryNumber, password);
        }catch(CouldNotLoginException e){

        }
        return loggedUser;
    }

    public void addNewOption(User user){
        this.menuController.addMenuOption(new MyInfoOption(user));
    }
}
