package com.lab_5;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Толкин","Хоббит");
        Book book2 = new Book("Толстой","Война и мир");
        Book book3 = new Book("Карл Маркс","Капитал");
        Book book4 = new Book("Роулинг","Гарри Поттер");

        Student student1 = new Student("Иванов");
        Teacher teacher1 = new Teacher("Петров");

        student1.setBook(book1);



    }
}
