package com.lab_5;

import java.util.ArrayList;

public abstract class LibraryVisitors {
    private String surname;
    private ArrayList<Book> coll_book = new ArrayList<>();

    public LibraryVisitors(String surname){
        this.surname = surname;
    }

    public ArrayList<Book> getColl_book() {
        return coll_book;
    }

    public void setBook(Book book){
        coll_book.add(book);
    }

    public void getBook(){ // для тестирования
        System.out.println(coll_book.get(0).getName_book());
    }

    public abstract void printBooks();
}
