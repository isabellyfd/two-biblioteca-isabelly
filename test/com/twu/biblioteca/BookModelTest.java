package com.twu.biblioteca;

import org.junit.Test;
import com.twu.biblioteca.Entity.Book;

import static org.junit.Assert.assertEquals;

public class BookModelTest {

    @Test
    public void testBookAttributesEquality(){

        Book book = new Book();
        assertEquals("O pequeno príncipe", book.getName("O pequeno príncipe"));
        assertEquals("Le vie es rouge", book.getAuthor("Le vie es rouge"));
        assertEquals("10/09/2018", book.getFormatedPublishDate("10/09/2018"));
    }
}
