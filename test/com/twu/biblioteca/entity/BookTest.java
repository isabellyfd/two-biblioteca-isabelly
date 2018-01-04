package com.twu.biblioteca.entity;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookTest {


    @Test
    public void testBookAttributesEquality() {

        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        assertEquals("O pequeno príncipe", book.getName());
        assertEquals("Le vie es rouge", book.getAuthor());
        assertEquals(2001, book.getPublishYear());
        assertEquals(true, book.isAvailable());
    }

    @Test
    public void testIsAvailableDidChangeTheValueToFalse() {
        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        book.setAvailable(false);
        assertEquals(false, book.isAvailable());
    }

    @Test
    public void testIfABookIsEqualsToItself(){
        Book book = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        Book sameBook = new Book("O pequeno príncipe", "Le vie es rouge" , 2001);
        assertEquals(true, book.equals(sameBook));
    }


}
