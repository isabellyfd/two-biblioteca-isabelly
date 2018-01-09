package com.twu.biblioteca.menu;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.menu.constants.Commands;

public class MyInfoOption extends Option {

    MyInfoOption(User user){
        this.setCommand(Commands.MY_INFO_COMMAND);
    }

    @Override
    public void action(int index) {

    }
}
