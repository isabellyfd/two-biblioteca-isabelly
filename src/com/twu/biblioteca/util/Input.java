package com.twu.biblioteca.util;

public class Input {
    private String command;
    private int argument;

    public Input(String command, int argument) {
        this.command = command;
        this.argument = argument;
    }

    public Input(String command){
        this.command = command;
        this.argument = -1;
    }

    public String getCommand() {
        return this.command;
    }

    public int getArgument() {
        return this.argument;
    }
}
