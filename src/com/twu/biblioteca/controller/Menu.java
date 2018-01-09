package com.twu.biblioteca.controller;

import com.twu.biblioteca.menu.Option;
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
            ConsoleHelper.shared.printMessage(option.getMessage());
        }
        ConsoleHelper.shared.printMessage("");
    }

    public Option getOptionFor(String command){
        for (Option option : this.options){
            if (option.check(command))
                return option;
        }
        return null;
    }

    public void addMenuOption(Option option){
        Option [] newMenu = new Option[this.options.length + 1];
        for (int i = 0; i < this.options.length; i++) {
            newMenu[i] = this.options[i];
        }
        newMenu[this.options.length] = option;
        this.options = newMenu;
    }
}
