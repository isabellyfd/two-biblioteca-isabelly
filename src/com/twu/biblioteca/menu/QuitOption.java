package com.twu.biblioteca.menu;

public class QuitOption extends Option {
    private final int EXIT_WITHOUT_ERRORS = 0;

    public QuitOption(){
        this.setCommand(Commands.QUIT_COMMAND);
        this.setMessage(Commands.QUIT_COMMAND_MESSAGE);
    }

    public void action() {
        System.exit(EXIT_WITHOUT_ERRORS);
    }
}
