package com.twu.biblioteca.menu;

public class ReturnOption extends Option {

    public ReturnOption(){
        this.setCommand(Commands.RETURN_COMMAND);
        this.setMessage("[return] returns a book to library");
    }

    @Override
    public void action(int index) {

    }
}
