package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class BibliotecaApp {

    private LibraryController controller;

    public BibliotecaApp(ArrayList<Book> books){

        this.controller = new LibraryController(books);
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown, Clement Hurd", 2007));
        books.add(new Book("Press Here", "Herve Tullet", 2011));

        BibliotecaApp app = new BibliotecaApp(books);

        app.printWelcomeMessage();
        app.printAllBooksAvailable();

    }

    public void printWelcomeMessage(){
        System.out.print(ConsoleHelper.welcomeMessage());
    }

    protected ArrayList<Book> getBooksInLibrary() {
        return this.controller.listAllAvailableBooks();
    }

    public void printAllBooksAvailable() {
        ConsoleHelper.printList(getBooksInLibrary());
    }

    public void printMenu() {
        System.out.println("[list] shows you all avaliable books in the library");
    }
}
