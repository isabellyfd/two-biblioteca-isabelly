package com.twu.biblioteca.util;

public class ListOption {

    private final String COMMAND = "list";

    public boolean check(String userInput){
        return COMMAND.equals(userInput);
    }

    public String getMessage(){
        return "[list] shows you all avaliable books in the library";
    }

}
