package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {


    @Test
    void testGetBooksWithShallowCopy(){
        //given
        Library library = new Library("Library");
        Book book = new Book("foo","foo", LocalDate.now());
        Book book1 = new Book("foo1","foo1", LocalDate.now());
        Book book2 = new Book("foo2","foo2", LocalDate.now());
        Book book3 = new Book("foo3","foo3", LocalDate.now());
        Book book4 = new Book("foo3","foo3", LocalDate.now());
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowCopyLibrary;
        try {
            shallowCopyLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //when
        //then
        assertEquals(shallowCopyLibrary.getBooks().size(),library.getBooks().size());

    }
    @Test
    void testGetBooksWithDeepCopy(){
        Library library = new Library("Library");
        Book book = new Book("foo","foo", LocalDate.now());
        Book book1 = new Book("foo1","foo1", LocalDate.now());
        Book book2 = new Book("foo2","foo2", LocalDate.now());
        Book book3 = new Book("foo3","foo3", LocalDate.now());
        Book book4 = new Book("foo3","foo3", LocalDate.now());
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library deepCopyLibrary;
        try {
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //when
        deepCopyLibrary.getBooks().add(book4);
        //then
        assertEquals(5,deepCopyLibrary.getBooks().size());
        assertEquals(4,library.getBooks().size());

    }
}
