package com.twu.biblioteca.entity;

import org.junit.Test;


import org.junit.Assert;

public class BookTest {


    @Test
    public void testBookAttributesEquality() {

        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        Assert.assertEquals("O pequeno príncipe", book.getName());
        Assert.assertEquals("Le vie es rouge", book.getAuthor());
        Assert.assertEquals(2001, book.getPublishYear());
        Assert.assertEquals(true, book.isAvailable());
    }

    @Test
    public void testIsAvailableDidChangeTheValueToFalse() {
        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        book.setAvailable(false);
        Assert.assertEquals(false, book.isAvailable());
    }

    @Test
    public void testIfABookIsEqualsToItself(){
        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        Book sameBook = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        Assert.assertEquals(true, book.equals(sameBook));
    }


}
