package com.lab_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание книг
        Book book1 = new Book("Толкин","Хоббит");
        Book book2 = new Book("Толстой","Война и мир");
        Book book3 = new Book("Карл Маркс","Капитал");
        Book book4 = new Book("Роулинг","Гарри Поттер");

        // Создание Студентов и Преподавателей
        Student student1 = new Student("Иванов");
        Teacher teacher1 = new Teacher("Петров");
        Teacher teacher2 = new Teacher("Сидоров");

        // Добавление им книг
        teacher1.setBook(book1);
        teacher1.setBook(book2);
        teacher1.setBook(book3);
        teacher1.setBook(book4);

        teacher2.setBook(book1);
        teacher2.setBook(book2);
        teacher2.setBook(book3);
        teacher2.setBook(book4);

        student1.setBook(book1);
        student1.setBook(book2);
        student1.setBook(book3);
        student1.setBook(book4);
//        student1.printBooks(); // вывод книг взятых студентом

        // Создание библиотеки И добавление в нее студентов и преподавателей
        Library library = new Library();
        library.set_lib_vis(student1);
        library.set_lib_vis(teacher1);
        library.set_lib_vis(teacher2);

        // прописал этот код здесь, а не в классах потому что метод по заданию должен ВОЗВРАЩАТЬ
        // список фамилий. А для их вывода уже как минимум потребуется цикл. Поэтому решил
        // сделать здесь и проверки, чтоб не ломать логику программы и не усложнять.
        if (library.get_lib_vis() != 0){
            // Поиск читателей с наибольщим количеством книг
            ArrayList<LibraryVisitors> a = new ArrayList<>(library.findMaxReader());
            if (a.size() == 1){
                System.out.println(library.findMaxReader().get(0).getSurname());
            } else {
                for (LibraryVisitors lib_vi : a) {
                    System.out.println(lib_vi.getSurname());
                }
            }
        } else {
            System.out.println("В библиотеке нет поситителей.");
        }
    }
}
