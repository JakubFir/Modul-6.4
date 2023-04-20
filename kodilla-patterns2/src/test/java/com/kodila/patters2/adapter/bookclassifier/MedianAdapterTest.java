package com.kodila.patters2.adapter.bookclassifier;

import com.kodila.patters2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTest {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book = new Book("foo","foo",10,"As");
        Book book1 = new Book("foo1","foo1",20,"As1");
        Book book2= new Book("foo2","foo2",30,"As2");
        Book book3 = new Book("foo3","foo3",40,"As3");
        Book book4 = new Book("foo4","foo4",50,"As4");
        Set<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
       int reuslt = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(30, reuslt);

    }


}