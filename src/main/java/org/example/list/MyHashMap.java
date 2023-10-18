package org.example.list;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Lagos", 400);
        map.put("Kwara", 590);
        map.put("Benin", 300);
        map.put("Osun", 100);

        System.out.println(map);

//        Access the value corresponding to the key
        Integer LagosValue = map.get("Lagos");
        System.out.println(LagosValue);
//      Remove values corresponding to key
        map.remove("Osun");
        System.out.println(map);
        System.out.println(map.size());
        map.replace("Kwara", 590, 700);
        System.out.println(map);
        boolean keyExists = map.containsKey("Jalingo");
        System.out.println(keyExists);
    }
}
