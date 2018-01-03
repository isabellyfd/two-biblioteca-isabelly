package com.twu.biblioteca;

import org.junit.Test;
import com.twu.biblioteca.Entity.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import static org.junit.Assert.assertEquals;

public class BookModelTest {

    @Test
    public void testBookAttributesEquality() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date publishDate = (Date) dateFormat.parse("10/09/2018");

            Book book = new Book("O pequeno príncipe", "Le vie es rouge" , publishDate);
            assertEquals("O pequeno príncipe", book.getName());
            assertEquals("Le vie es rouge", book.getAuthor());
            assertEquals("10/09/2018", book.getFormatedPublishDate());

        } catch (ParseException e) { }

    }
}
