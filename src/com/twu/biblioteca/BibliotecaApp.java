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
        System.out.println("Hello, world!");
    }

    public void printWelcomeMessage(){
        System.out.print(ConsoleHelper.welcomeMessage());
    }

    protected ArrayList<Book> getBooksInLibrary() {
        return this.controller.listAllAvailableBooks();
    }

    public void printAllBooksAvailable() {
        for (Book book : getBooksInLibrary()){
            System.out.println(book.toString());
        }
    }
}
