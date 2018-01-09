package com.twu.biblioteca.menu;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.menu.constants.Commands;
import com.twu.biblioteca.util.ConsoleHelper;

public class MyInfoOption extends Option {

    private User me;

    MyInfoOption(User user){
        this.setCommand(Commands.MY_INFO_COMMAND);
        this.setMessage(Commands.MY_INFO_COMMAND_MESSAGE);
        this.me = user;
    }

    @Override
    public void action(int index) {
        ConsoleHelper.shared.printMessage(this.me.toString());
    }
}
