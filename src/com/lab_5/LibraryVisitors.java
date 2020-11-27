package com.lab_5;

import java.util.ArrayList;

public abstract class LibraryVisitors {
    private String surname;
    private ArrayList<Book> coll_book = new ArrayList<>();

    public LibraryVisitors(String surname){
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Book> getColl_book() {
        return coll_book;
    }

    public void setBook(Book book){
        coll_book.add(book);
    }

    public abstract void printBooks();
}
