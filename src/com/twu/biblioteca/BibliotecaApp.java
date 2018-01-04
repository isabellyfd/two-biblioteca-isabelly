package com.twu.biblioteca;

import com.twu.biblioteca.util.ConsoleHelper;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    protected void printWelcomeMessage(){
        System.out.print(ConsoleHelper.welcomeMessage());
    }
}
