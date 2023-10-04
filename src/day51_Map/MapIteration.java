package day51_Map;

import java.util.*;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();

        students.put("Student1", 50);
        students.put("Student2", 60);
        students.put("Student3", 70);
        students.put("Student4", 80);
        students.put("Student5", 90);
        students.put("Student6", 100);
        students.put("Student7", 40);

        // get all the Keys in the Map --> keySet Method --> gives all the keys that are included in the map --> which returns Collection ,so we can apply each loop

        // retrieve all the keys from the Map
        Set<String> keysInTheMap = students.keySet();

        /*
        // remove all the students whose score is less than 90
        for (String each : students.keySet()) { // converts to Set by using keySet and gets each of the Map element
            Integer eachValue = students.get(each); // gets the value
            if(eachValue < 90){
                System.out.println(each);
            }
        }

        // iterate through the Set // get the Key & Value
        for (String eachKey : keysInTheMap) {
            System.out.println(eachKey + " : " + students.get(eachKey));

            // increase each value by 5
            students.replace(eachKey, students.get(eachKey) + 5);
        }
        */

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) { // gets each key
            Integer value = students.get(key); // gets the value

            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }

        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        // convert students Map to Set which allows us to manipulate the data
        // after this you can also convert to List, Array etc...
        Set<String> names = students.keySet();

        System.out.println("---------------------------");

        // Collection<Integer> scores = students.values();
        // List contains all the values of the students which also has index numbers
        List<Integer> scores = new ArrayList<>( students.values() );

        for (Integer each : students.values()) { // for each is available for any data structure

        }

        System.out.println("---------------------");

        // Find the Key with the max value
        // first we'll find the maximum score
        // first we find the min value and then compare it with every single score in the Map
        // Therefore we iterate the value and use values() method and it's return type is Collection
        // So we can access each score by using for loop

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score > maxScore){
                maxScore = score;
            }

            if(score < minScore){
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("----------------------------");

        // By using Collections Utility max/min method and values() method we can find the min/max value of the students
        int max = Collections.max( students.values() );
        int min = Collections.min( (students.values()) );


    }


}
