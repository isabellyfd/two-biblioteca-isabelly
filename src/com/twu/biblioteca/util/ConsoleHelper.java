package com.twu.biblioteca.util;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import com.twu.biblioteca.entity.Book;

import java.awt.*;
import java.io.Console;
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

    public static Input getUserInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return ConsoleHelper.parseInput(input);
    }

    protected static Input parseInput(String input){
        String[] splited = input.split(" ");
        if (splited.length > 1){
            return new Input(splited[0], Integer.valueOf(splited[1]));
        }else{
            return new Input(splited[0]);
        }
    }

    public static int getIntFromUser() {
        return new Scanner(System.in).nextInt();
    }
}
