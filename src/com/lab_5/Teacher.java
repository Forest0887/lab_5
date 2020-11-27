package com.lab_5;

class Teacher extends LibraryVisitors{

    public Teacher(String surname) {
        super(surname);
    }

    @Override
    public void printBooks() {
        System.out.println("Я взял так много для студентов");
    }
}
