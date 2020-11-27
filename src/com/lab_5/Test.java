package com.lab_5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();

        System.out.println(books);

        books.add(new Book("Tolkien","Lord of the rings"));
        books.add(new Book("Kafca","popa siela trusi"));

        ArrayList<Book> books1 = new ArrayList<>();
        books1.addAll(books);

        System.out.println(books1.get(1).getName_book());
        System.out.println(books1.get(0).getName_book());
    }
}
