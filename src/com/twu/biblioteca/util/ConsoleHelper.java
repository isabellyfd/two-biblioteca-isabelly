package com.twu.biblioteca.util;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import com.twu.biblioteca.entity.Book;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleHelper {

    private static final String WELCOME_MESSAGE = "Hello, explorer!\nWelcome to Isabelly's awesome library!\nI hope you enjoy your stay!\n";

    public static String welcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public static void printList(ArrayList<Book> books){
        int count = 1;
        for(Book book : books){
            System.out.println(count + " - " + book.toString());
            count++;
        }
        System.out.println();
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static String getUserInput() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    protected static Input parseInput(String input){
        return new Input("checkout", 1);
    }
}
