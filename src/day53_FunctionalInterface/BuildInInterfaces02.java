package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInInterfaces02 {

    public static void main(String[] args) {

        // create a function that can check if the Integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) -> {

            boolean result = false;

            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("------------------------------------------------");

        // Create a function that can check if two Strings are anagram
        BiPredicate<String, String> anagramString = (j, k) -> {
            String[] arr1 = j.split("");
            String[] arr2 = k.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);

        };

        System.out.println("------------------------------------------------");

        // Create a function that can check if two integer arrays are anagram
        BiPredicate<int[], int[]> anagramInt = (l, m) -> {
          Arrays.sort(l);
          Arrays.sort(m);
          return Arrays.equals(l,m);

        };

        System.out.println("------------------------------------------------");

        // Create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Smyrna", 5);

        System.out.println("------------------------------------------------");

        // Create a function that takes first and last names and returns the formatted full name with lambda expressions
        // "jAvA", "PROGRAMING" --> Java Programming



        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("name1", "A");
        scrumTeam1.put("name2", "B");
        scrumTeam1.put("name2", "B");
        scrumTeam1.put("name2", "B");
        scrumTeam1.put("name2", "B");

        //for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            //String k = entry.getKey();
            //String v = entry.getValue();
            //System.out.println(k + " : " + v);
        //}

        scrumTeam1.forEach( (k,v) -> System.out.println(k + " : " + v) );

        System.out.println("------------------------------------------------");

        // Create a function that takes two integers and return
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b) ? a:b;
        int max = maxNum.apply(100, 200);
        System.out.println(max);

        System.out.println("-------------------------");

        // Create a function that can merge two integer arrays into a list
        BiFunction<int[], int[], List<Integer>> merge = (x,y) -> {

            List<Integer> result = new ArrayList<>();

            for (int each : x) result.add(each);

            for (int each : y) result.add(each);

            return result;

        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        List<Integer> numbers = merge.apply(arr1, arr2);
        System.out.println(numbers);

        System.out.println("-------------------------");

        // Create a function that takes a List of String and a List of Integer and merge them into a Map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}

        map ==> {Josh=100, Daniel =110}
         */
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (q, w) -> {

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < q.size(); i++) {
                map.put(q.get(i), w.get(i));
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Kobe", "Lebron", "Jordan"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(70,80,90));

        Map<String, Integer> students = merge2.apply(names,scores);

        System.out.println(students);

    }

}
