package com.twu.biblioteca.menu;

import com.twu.biblioteca.util.ConsoleHelper;

public class Menu {
    private Option[] options;

    public Menu(Option... options) {
        this.options = options;
    }

    public Option[] getOptions() {
        return this.options;
    }

    public boolean isCommandAvailable(String command) {
        for (Option option : this.options){
            if (option.check(command)) return true;
        }
        return false;
    }

    public void printMenu() {
        for(Option option : this.options){
            ConsoleHelper.printMessage(option.getMessage());
        }
    }

    public Option getOptionFor(String command){
        if (options[0].check(command))
            return options[0];
        else
            return options[1];
    }
}
