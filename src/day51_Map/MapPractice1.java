package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

/*
        // 1. Update the "M" to Male and "F" to Female
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){ // get returns the value of the key
               employeeMap.replace(key, "Male");
            }

            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }
        System.out.println(employeeMap);

 */


        // Iterate by Entry because it contains Key and Value
        // returns all the entry as a Set --> which contains Key and Value both
        // entry contains all the Keys and Values
        // we use getValue to get the values only
        // when you iterate the Map by entry, it's better to use setValue instead of replace because it's easier
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

            if (entry.getValue().equalsIgnoreCase("m")) {
                entry.setValue("Male");
                // 2nd option
                // employeeMap.replace(entry.getKey(), "Male");
            }
            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");

            }
            System.out.println(employeeMap);


            System.out.println("------------------------------");

            // 2. Display the names of all female employees

            for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
                String eachKey = pair.getKey(); // represents the names
                String eachValue = pair.getValue(); // represents the genders

                if(eachValue.equalsIgnoreCase("female"));
                System.out.println(eachKey);

            }




        }

    }
}