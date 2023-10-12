package day52_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {



        // Map1 is the pair of Map2

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(11, "QA");
        map1.put(12, "SDET");
        map1.put(13, "Developer");
        map1.put(14, "BA");
        map1.put(15, "SM");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Lebron", 100000);
        map2.put("Jordan", 110000);
        map2.put("Kobe", 120000);
        map2.put("Durant", 130000);
        map2.put("Curry", 140000);

        Map< Map<Integer, String>, Map<String,Integer>> mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1,map2);

        // Print the job titles & names separately
        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {

            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) {
                System.out.println(entry.getValue());
            }

            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) {

                System.out.println(entry.getKey());

            }

        }

        System.out.println("---------------------------------");

        System.out.println( mapOfMap.get(map1).get("Curry") );

        Map<Map<Map<Integer, Integer>, Map<Integer, Integer>>, Map<Map<Integer, Integer>, Map<Integer, Integer>> > mapOfMapOfMap = new LinkedHashMap<>();

    }

}

/*
    ID    JobTitle          Name        Salary
    11,  "QA"               "Lebron"     100000
    12,  "SDET"             "Jordan"     110000
    13,  "Developer"        "Kobe"       120000
    ...
 */
