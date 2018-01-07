package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class ListOption extends Option {

    public ListOption() {
        this.setCommand(Commands.LIST_COMMAND);
        this.setMessage(Commands.LIST_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        ArrayList<Book> availableBooks = Facade.shared.getAllAvailableBooks();
        ConsoleHelper.printList(availableBooks);
    }
}
