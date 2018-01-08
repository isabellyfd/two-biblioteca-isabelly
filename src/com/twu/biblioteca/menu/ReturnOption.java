package com.twu.biblioteca.menu;

public class ReturnOption extends Option {

    public ReturnOption(){
        this.setCommand(Commands.RETURN_COMMAND);
        this.setMessage(Commands.RETURN_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {

    }
}
