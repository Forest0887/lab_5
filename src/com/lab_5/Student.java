package com.lab_5;

class Student extends LibraryVisitors{

    public Student(String surname) {
        super(surname);
    }

    @Override
    public void printBooks() { // getColl_book().size()
        if (getColl_book().isEmpty()){
            System.out.println("Книг нет");
        } else {
            System.out.println("Список взятых книг:");
            for (int i = 0; i < getColl_book().size(); i++){
                System.out.println("\"" + getColl_book().get(i).getName_book() + "\""
                + " Автор - " + getColl_book().get(i).getName_author());
            }
        }
    }
}