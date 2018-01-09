package com.twu.biblioteca.entity;

public class User {
    private String name;
    private String email;
    private String phone;
    private String libraryNumber;
    private String password;

    public User(String name, String email, String phone, String libraryNumber, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean checkLibraryNumber(String libraryNumber){
        return this.libraryNumber.equals(libraryNumber);
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
