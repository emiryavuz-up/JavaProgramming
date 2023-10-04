package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3_InterviewQuestion {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalal", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cary", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        // displays the names of all employees who has the maximum salary

        int maxSalary = Integer.MIN_VALUE;


        for (Integer eachValue : map.values()) {
            if (eachValue > maxSalary) {
                maxSalary = eachValue;
            }

        }
        System.out.println(maxSalary);



        //int maxSalary = Collections.max( (map.values()) );
        //System.out.println(maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {

            if(pair.getValue().equals(maxSalary)){
                System.out.println("Name of the employees with the maximum salary = " + pair.getKey());
            }

        }



    }
}