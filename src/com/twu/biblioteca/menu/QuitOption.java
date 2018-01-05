package com.twu.biblioteca.menu;

public class QuitOption extends Option {

    public QuitOption(){
        this.setCommand(Commands.QUIT_COMMAND);
        this.setMessage(Commands.QUIT_COMMAND_MESSAGE);
    }
}
