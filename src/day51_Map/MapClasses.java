package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        // map only accepts pairs, what we store as Key can't but Value can be duplicated.
        // only ONE null can be given for the Key but for value we can use null for the Value more than once

        // disadvantage is order is random
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Jordan");
        hashMap.put(20, "Kobe");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Lebron");
        hashMap.put(6, "Lebron");
        hashMap.put(7, "Lebron");
        hashMap.put(8, "Lebron");
        hashMap.put(9, null);
        hashMap.put(13, null);
        hashMap.put(null, "Curry");
        hashMap.put(null, "Durant");
        hashMap.put(null, "Howard");
        hashMap.put(null, "Curry");

        System.out.println("hashMap = " + hashMap);

        // order does not change, LinkedHashMap keeps the insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Jordan");
        linkedHashMap.put(20, "Kobe");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(5, "Lebron");

        System.out.println("linkedHashMap = " + linkedHashMap);


        // Keeps the descending order, Key can not be null, value can be null and duplicated
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Jordan");
        treeMap.put(20, "Kobe");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");
        treeMap.put(5, "Lebron");
        // treeMap.put(null, "John"); // Throws NullPointerException
        System.out.println("treeMap = " + treeMap);

        // Key & Value can not be null
        Map<Integer, String> hashtable = new Hashtable();
        hashtable.put(10, "Jordan");
        hashtable.put(20, "Kobe");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");
        hashtable.put(5, "Lebron");
        System.out.println("hashtable = " + hashtable);


    }

}
