package com.twu.biblioteca.menu;

import com.twu.biblioteca.menu.constants.Commands;

public class QuitOption extends Option {
    private final int EXIT_WITHOUT_ERRORS = 0;

    public QuitOption(){
        this.setCommand(Commands.QUIT_COMMAND);
        this.setMessage(Commands.QUIT_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        System.exit(EXIT_WITHOUT_ERRORS);
    }
}
