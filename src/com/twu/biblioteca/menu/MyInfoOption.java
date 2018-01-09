package com.twu.biblioteca.menu;

import com.twu.biblioteca.entity.User;

public class MyInfoOption extends Option {

    MyInfoOption(User user){
        this.setCommand("my-info");
    }

    @Override
    public void action(int index) {

    }
}
