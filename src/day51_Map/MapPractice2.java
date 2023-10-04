package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {


    public static void main(String[] args) {

        // who has the maximum salary

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalal", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cary", 119000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        String name1 = ""; // temporary value
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {

            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if(eachValue < minSalary){
                maxSalary = eachValue;
                name2 = eachKey;
            }

        }

        System.out.println(name1);
        System.out.println(name2);

        System.out.println("-----------------------------------");


        // how many employees has the salary between 120 - 150k? --> hint: we don't need the name, only the value
        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }
        System.out.println("count = " + count);

        // display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if( (entry.getValue() < 118000) ){
                System.out.println(entry.getKey());
            }
        }

        System.out.println(map);

        System.out.println("-----------------------");

        // increase the salary employee by 10k if the current salary of employee is less than 120k
        // iterates each value and increase the salary by 10000 if it's less than 120000
        for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
            if(entry2.getValue() < 120000){
                entry2.setValue(entry2.getValue() + 10000);
            }
        }
        System.out.println(map);



    }

}


/*
Given the following map that contains the employee name and their salary:
Map<String, Integer> map = new LinkedHashMap<>()
map.put("John", 123000);
map.put("Antony", 100000);
map.put("Jimmy", 115000);
map.put("James", 110000);
map.put("Conor", 85000);
map.put("Josh", 117000);
map.put("Cary", 119000);
map.put("Anderson", 125000);
map.put("Steven", 135000);

 */