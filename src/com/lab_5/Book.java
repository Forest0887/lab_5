package com.lab_5;

public class Book {
    private final String name_author;
    private final String name_book;

    public Book(String name_author, String name_book){
        this.name_author = name_author;
        this.name_book = name_book;
    }

    public String getName_book() {
        return name_book;
    }

    public String getName_author() {
        return name_author;
    }
}
