package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class BibliotecaApp {

    public BibliotecaApp(ArrayList<Book> books){

    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public void printWelcomeMessage(){
        System.out.print(ConsoleHelper.welcomeMessage());
    }

    protected ArrayList<Book> getBooksInLibrary() {
        return new ArrayList<>();
    }
}
