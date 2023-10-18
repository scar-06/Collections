package org.example.list;

import java.util.LinkedList;

public class myLinkedList {
    public static void main(String[] args) {
//        Creating list of books
        LinkedList<Book2> book2List = new LinkedList<>();
//        Creating books
        Book2 b1 = new Book2(1, "Love", "Favour", 50);
        Book2 b2 = new Book2(2, "Passion", "Peace", 10);
        Book2 b3 = new Book2(3, "Corruption", "Tosin", 40);
        Book2 b4 = new Book2(4, "Attention", "Bayo", 50);
//      Adding books to the list
        book2List.add(b1);
        book2List.add(b2);
        book2List.add(b3);
        book2List.add(b4);
        for (Book2 book2 : book2List) {
            System.out.println(book2.id + " " + book2.name + " " + book2.author + " " + book2.quantity);
        }
    }
}

class Book2 {
    int id;
    String name;
    String author;
    int quantity;

    public Book2(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}
