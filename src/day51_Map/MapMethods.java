package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // create a data structure that contains name & score of the student

        // LinkedHashMap keeps the insertion order.
        // HashMap maintains the random order, but it's fastest.
        // Key can never be duplicated in any Map.
        Map<String, Integer> students = new LinkedHashMap<>();

        students.put("Student1", 50);
        students.put("Student2", 60);
        students.put("Student3", 70);
        students.put("Student4", 80);
        students.put("Student5", 96);
        students.put("Student6", 100);
        students.put("Student7", 40);

        // display score of student5
        System.out.println(students.get("Student5"));

        // replace student3 score with 90
        students.replace("Student3", 90);

        // remove Student4 and decrease the size
        students.remove("Student4");

        // check if the students contain Smyrna
        boolean r1 = students.containsKey("Smyrna");
        System.out.println(r1);

        // check if the students has 500 as their score
        boolean r2 = students.containsValue(500);
        System.out.println(r2);

        // check if the students is empty --> returns boolean value
        System.out.println(students.isEmpty());

        // check if map1 and map2 is equal
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);


        System.out.println(students);
        System.out.println(students.size());

        System.out.println("----------------------------");

        // how many students has the score of 95 or greater
        int count = 0;
        for (Integer eachGrade : students.values()) {
            if(eachGrade >= 95){
                // if each score is more than 95 or greater we increase the count
                count++;
            }
        }
        System.out.println(count);

        int count2= 0;

        // Iterate the Keys of the Map
        // We need to call KeySet method which returns Collection, after we can apply each loop
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore >= 95){
                count2++;
            }
        }
        System.out.println(count2);

        System.out.println("----------------------------------------");

        // Entry contains keys and values
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()); // only returns the Keys
            System.out.println(entry.getValue()); // only returns the Values
        }

    }

}
