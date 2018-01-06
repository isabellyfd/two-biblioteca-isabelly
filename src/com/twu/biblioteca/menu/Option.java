package com.twu.biblioteca.menu;

public abstract class Option {
    private String command;
    private String message;

    public String getCommand() { return this.command; }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public boolean check(String command) {
        return this.command.equals(command);
    }

    public abstract void action();
}
