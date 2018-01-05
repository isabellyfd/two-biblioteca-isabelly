package com.twu.biblioteca.entity;

public class QuitOption extends Option {

    public QuitOption(){
        this.setCommand(Commands.QUIT_COMMAND);
        this.setMessage(Commands.QUIT_COMMAND_MESSAGE);
    }
}
