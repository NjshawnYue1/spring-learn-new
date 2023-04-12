package com.ga.entity;

public class BookFactory {

    private Book book;

    public Book getBook() {
        if (book == null) {
            book = new Book();
        }
        return book;
    }
}
