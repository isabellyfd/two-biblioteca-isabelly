package com.twu.biblioteca.menu;

import com.twu.biblioteca.Facade;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.exception.CouldNotReturnBookException;
import com.twu.biblioteca.util.ConsoleHelper;

import java.util.ArrayList;

public class ReturnOption extends Option {

    public ReturnOption(){
        this.setCommand(Commands.RETURN_COMMAND);
        this.setMessage(Commands.RETURN_COMMAND_MESSAGE);
    }

    @Override
    public void action(int index) {

        ArrayList<Book> reservedBooks = Facade.shared.getAllBorrowedBooks();

        if (reservedBooks.size() == 0){
            ConsoleHelper.printMessage("There isn't books to return!");
            ConsoleHelper.printMessage("");
        }else {
            ConsoleHelper.printList(reservedBooks);
            ConsoleHelper.printMessage("Choose a book above to return to library:");
            int number = ConsoleHelper.getIntFromUser();

            if(number <= reservedBooks.size() && number > 0){
                try{
                    Facade.shared.returnBook(reservedBooks.get(--number));
                    ConsoleHelper.printMessage("Thank you for returning the book.");
                }catch (CouldNotReturnBookException  exception){ }
            }else{
                ConsoleHelper.printMessage("This is not a valid option!");
            }
        }
    }
}
