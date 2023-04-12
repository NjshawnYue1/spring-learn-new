package com.ga.entity;

public class BookStaticFactory {

    private static Book book;

    public static Book createBook() {
        if (book == null){
            book = new Book();
        }
        return book;
    }

}
