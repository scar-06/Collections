package org.example.list;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> myHash = new HashSet<>();
//        HashSet doesn't allow duplicates of values, including null values. All must be unique.
        myHash.add("Intervals");
        myHash.add("Fingers");
        myHash.add("Intervals");
        myHash.add("Interests");
        myHash.add("Lagos");
        myHash.add(null);
        myHash.add(null);
//        Advanced for() loop
        for (String items:
             myHash) {
            System.out.println("Using advanced for() loop: " + items);
        }
//        Using forEach() method
//        NOTE: "->" indicates a lambda expression
        myHash.forEach(item -> System.out.println(item));
    }
}
