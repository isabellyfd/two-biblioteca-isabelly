package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;
import com.twu.biblioteca.util.ListOption;

import java.util.ArrayList;

public class BibliotecaApp {

    private LibraryController controller;
    private ListOption listOption;

    public BibliotecaApp(ArrayList<Book> books){
        this.controller = new LibraryController(books);
        this.listOption = new ListOption();
    }

    public static void main(String[] args) {
        runLibrary();
    }

    private static void runLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        BibliotecaApp app = new BibliotecaApp(books);

        app.printWelcomeMessage();
        app.printMenu();

        String option = ConsoleHelper.getUserInput();

        if (app.isAvailableCommand(option)) {
            System.out.println("ok");
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
        ListOption list = new ListOption();
        ConsoleHelper.printMessage(listOption.getMessage());
    }

    public boolean isAvailableCommand(String command) {
        ListOption list = new ListOption();
        return listOption.check(command);
    }
}
