package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.ListOption;
import com.twu.biblioteca.util.QuitOption;

import java.util.ArrayList;

public class BibliotecaApp {

    private LibraryController controller;
    private ListOption listOption;

    protected BibliotecaApp(ArrayList<Book> books){
        this.controller = new LibraryController(books);
        this.listOption = new ListOption();
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

        app.printWelcomeMessage();
        app.printMenu();

        String option = ConsoleHelper.getUserInput();
        if (app.isAvailableCommand(option)) {
           ConsoleHelper.printList(app.getBooksInLibrary());
        }else {
            ConsoleHelper.printMessage("This option is not available! (try to fix the spelling)");
        }
    }

    public void printWelcomeMessage(){
        ConsoleHelper.printMessage(ConsoleHelper.welcomeMessage());
    }

    protected ArrayList<Book> getBooksInLibrary() {
        return this.controller.listAllAvailableBooks();
    }

    public void printAllBooksAvailable() {
        ConsoleHelper.printList(getBooksInLibrary());
    }

    public void printMenu() {
        QuitOption quitOption = new QuitOption();
        ConsoleHelper.printMessage(listOption.getMessage());
        ConsoleHelper.printMessage(quitOption.getMessage());
    }

    public boolean isAvailableCommand(String command) {
        QuitOption quitOption = new QuitOption();
        if (listOption.check(command) || quitOption.check(command)) {
            return true;
        }
        return false;
    }
}
