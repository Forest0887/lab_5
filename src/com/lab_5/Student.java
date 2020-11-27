package com.lab_5;

class Student extends LibraryVisitors{

    public Student(String surname) {
        super(surname);
    }

    @Override
    public void printBooks() {
        System.out.println("реализуется выводом информации по всем взятым студентом книгам");
    }
}