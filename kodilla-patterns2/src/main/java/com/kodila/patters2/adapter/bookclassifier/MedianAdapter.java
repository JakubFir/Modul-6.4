package com.kodila.patters2.adapter.bookclassifier;

import com.kodila.patters2.adapter.bookclassifier.librarya.Book;
import com.kodila.patters2.adapter.bookclassifier.librarya.Classifier;
import com.kodila.patters2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodila.patters2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        for(Book book : bookSet){
            BookSignature signature = new BookSignature(book.getSignature());
            com.kodila.patters2.adapter.bookclassifier.libraryb.Book book1 =
                    new com.kodila.patters2.adapter.bookclassifier.libraryb.Book(book.getAuthor(), book.getTitle(),book.getPublicationYear());
            books.put(signature,book1);

        }
            return averagePublicationYear(books);
    }
}
