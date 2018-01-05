package com.twu.biblioteca.controller;

import org.junit.Test;
import org.junit.Assert;

import com.twu.biblioteca.menu.Option;
import com.twu.biblioteca.menu.QuitOption;
import com.twu.biblioteca.menu.ListOption;
import com.twu.biblioteca.menu.Menu;

public class MenuTest {

    @Test
    public void testCreationOfMenu() {
        Menu menu = new Menu(new ListOption(), new QuitOption());

        Assert.assertEquals(2, menu.getOptions().length);
        Assert.assertTrue(menu.getOptions()[0] instanceof ListOption);
        Assert.assertTrue(menu.getOptions()[1] instanceof QuitOption);
    }

    @Test
    public void testIfCommandIsAvailableInMenu() {
        Menu menu = new Menu(new ListOption(), new QuitOption());
        String command = "quit";
        Assert.assertTrue(menu.isCommandAvailable(command));

    }


}
