package com.twu.biblioteca;

import org.junit.Test;
import com.twu.biblioteca.Entity.Book;

import static org.junit.Assert.assertEquals;

public class BookModelTest {

    @Test
    public void testBookAttributesEquality(){

        Book book = new Book();
        assertEquals("O pequeno príncipe", book.getName());
        assertEquals("Le vie es rouge", book.getAuthor());
        assertEquals("10/09/2018", book.getFormatedPublishDate());
    }
}
