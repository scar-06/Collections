package org.example.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//       Creating a LinkedList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Dividends");
        myList.add("Investments");
        myList.add("ROIs");
        myList.add("Profits");
        System.out.println("Before sorting: " + myList);
//    sorting the above LinkedList
        Collections.sort(myList);
        System.out.println("After sorting: " + myList);
//        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Iterating LinkedList using For-each loop
        LinkedList<String> myList2 = new LinkedList<>();
        myList2.add("Dividends");
        myList2.add("Investments");
        myList2.add("ROIs");
        myList2.add("Profits");
        for (String item: myList2) {
            System.out.println(item);
        }

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Iterating LinkedList using Iterator data-type method
        LinkedList<String> myList3 = new LinkedList<>();
        myList3.add("Dividends");
        myList3.add("Investments");
        myList3.add("ROIs");
        myList3.add("Profits");
        Iterator<String> itr = myList3.iterator();
        while (itr.hasNext()) {
            System.out.println("MY ITERATOR METHOD GIVES: " + itr.next());
        }

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        LinkedList example to remove elements
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Nigeria");
        countries.add("Portugal");
        countries.add("Senegal");
        countries.add("Congo");
        countries.add("Ghana");
        System.out.println("Countries: " + countries);
        countries.remove(1);
        System.out.println("Countries after editing: " + countries);

        LinkedList<String> countries2 = new LinkedList<>();
        countries2.add("Brazil");
        countries2.add("Togo");
        countries2.add("Nigeria");
        System.out.println("Countries2: " + countries2);
//
//        countries.addAll(countries2);
//        System.out.println("Countries after adding Countries2: " + countries);

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Using the retainAll method to get values similar in 2 LinkedList
        countries.retainAll(countries2);
        System.out.println("VALUES AFTER RETAIN FUNCTION: " + countries);


    }

}
