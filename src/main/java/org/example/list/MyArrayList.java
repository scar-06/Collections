package org.example.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//       Creating an ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Dividends");
        myList.add("Investments");
        myList.add("ROIs");
        myList.add("Profits");
        System.out.println(myList);

//        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Iterating ArrayList using For-each loop
        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("Dividends");
        myList2.add("Investments");
        myList2.add("ROIs");
        myList2.add("Profits");
        for (String item: myList2) {
            System.out.println(item);
        }

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Iterating ArrayList using Iterator data-type method
        ArrayList<String> myList3 = new ArrayList<>();
        myList3.add("Dividends");
        myList3.add("Investments");
        myList3.add("ROIs");
        myList3.add("Profits");
        Iterator<String> itr = myList3.iterator();
        while (itr.hasNext()) {
            System.out.println("MY ITERATOR METHOD GIVES: " + itr.next());
        }

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        ArrayList example to remove elements
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Nigeria");
        countries.add("Portugal");
        countries.add("Senegal");
        countries.add("Congo");
        countries.add("Ghana");
        System.out.println("Countries: " + countries);
        countries.remove(1);
        System.out.println("Countries after editing: " + countries);

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Brazil");
        countries2.add("Togo");
        countries2.add("Nigeria");
        System.out.println("Countries2: " + countries2);
//
//        countries.addAll(countries2);
//        System.out.println("Countries after adding Countries2: " + countries);

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++
//        Using the retainAll method to get values similar in 2 ArrayLists
        countries.retainAll(countries2);
        System.out.println("VALUES AFTER RETAIN FUNCTION: " + countries);


    }


}
