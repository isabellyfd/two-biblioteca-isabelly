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

        if (thereIsBookToReturn(reservedBooks)){
            printConsoleMessagesOfNoBooksToReturn();
        }else {
            runActionsWhenIsPossibleToReturn(reservedBooks);
        }
    }

    private boolean thereIsBookToReturn(ArrayList<Book> reservedBooks) {
        return reservedBooks.size() == 0;
    }

    private void printConsoleMessagesOfNoBooksToReturn() {
        ConsoleHelper.shared.printMessage("There isn't books to return!");
        ConsoleHelper.shared.printMessage("");
    }

    private void runActionsWhenIsPossibleToReturn(ArrayList<Book> reservedBooks) {
        printAllBorrowedBooksInLibrary(reservedBooks);
        int number = ConsoleHelper.getIntFromUser();
        verifyInputCorrectnessAndAct(reservedBooks, number);
    }

    private void verifyInputCorrectnessAndAct(ArrayList<Book> reservedBooks, int number) {
        if(inputIsValidToReturnBook(reservedBooks, number)){
            actOnDecision(reservedBooks, number);
        }else{
            ConsoleHelper.shared.printMessage("This is not a valid option!");
        }
    }

    private void printAllBorrowedBooksInLibrary(ArrayList<Book> reservedBooks) {
        ConsoleHelper.shared.printList(reservedBooks);
        ConsoleHelper.shared.printMessage("Choose a book above to return to library:");
    }

    private void actOnDecision(ArrayList<Book> reservedBooks, int number) {
        try{
            Facade.shared.returnBook(reservedBooks.get(--number));
            ConsoleHelper.shared.printMessage("Thank you for returning the book.");
        }catch (CouldNotReturnBookException exception){
            ConsoleHelper.shared.printMessage(exception.getMessage());
        }
    }

    private boolean inputIsValidToReturnBook(ArrayList<Book> reservedBooks, int number) {
        return number <= reservedBooks.size() && number > 0;
    }
}
