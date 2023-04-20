package com.kodila.patters2.adapter.bookclassifier;

import com.kodila.patters2.adapter.bookclassifier.libraryb.Book;
import com.kodila.patters2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodila.patters2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodila.patters2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
