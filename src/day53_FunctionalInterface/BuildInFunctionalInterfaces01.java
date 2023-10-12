package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces01 {

    // Predicate : can be used when we need to create a boolean condition -> type can be any type and it returns boolean
    // if you ever need to create a function that takes ONE parameter and returns boolean at the end, you can always use this predicate functional interface
    // "p" is the preferred name for Predicate
    // for each method from a Collection is the most common used case of build in functionalities --> for each's shorter version
    public static void main(String[] args) {

        Predicate<String> isPalindrome =  (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        System.out.println("--------------------");

        Predicate<Integer> isEven = p -> p % 2 == 0;

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("--------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        list.removeIf(isEven);
        System.out.println(list);

        System.out.println("--------------------------------");

        //  takes one type and returns no value
        Consumer<String> printEach = (s) -> {

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i)); // getting each characters by using "i" as the index number
            }
        };
        printEach.accept("Selenium");

        System.out.println("------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (Integer each : list2) {
            if(each % 2 != 0){
                //System.out.println(each);
            }
        }

        System.out.println("------------------------------------");

        // above for loop is shorten below
        // p represents each number and if it's odd it will be displayed
        list2.forEach(p -> { if (p%2!=0) System.out.println(p);});

        System.out.println("------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Simushy Smyrna", "Aksel Reiz", "Naya Naya", "Limon Limon"));

        // displays the initials of every single employee
        employees.forEach( s -> System.out.println(s.charAt(0) +"."+ s.charAt(s.lastIndexOf(" ")+1 )) );

        System.out.println("------------------------------------");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // Array arr is converted to List
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("----------------------");

        // convert List of Integer to Array
        Function<List, int[]> convertToArray = (a) -> {

        };



    }

}
