package com.twu.biblioteca.entity;

public class User {
    private String name;
    private String email;
    private String phone;
    private String adress;
    private String libraryNumber;
    private String password;

    public User(String name, String email, String address, String phone, String libraryNumber, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.adress = address;
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

    public String toString() {
        return "Name: "+ this.name +
                "\nEmail: " + this.email +
                "\nAddress: " + this.adress +
                "\nPhone: " + this.phone;
    }
}
