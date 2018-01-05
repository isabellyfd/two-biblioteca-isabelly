package com.twu.biblioteca.menu;

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
}
