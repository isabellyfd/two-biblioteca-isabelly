package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class ListBooksOption extends Option {

    public ListBooksOption() {
        this.setCommand(Commands.LIST_BOOKS_COMMAND);
        this.setMessage(Commands.LIST_BOOKS_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {
        ArrayList<Book> availableBooks = Facade.shared.getAllAvailableBooks();
        ConsoleHelper.printList(availableBooks);
    }
}
