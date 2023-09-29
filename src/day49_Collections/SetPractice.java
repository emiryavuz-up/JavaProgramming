package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {


        String[] arr = {"Magic Wand", "Wand", "Magic", "Magic", "Pen", "Car", "Mouse", "Keyboard", "Magic Wand", "Wizard Wand",
        "Keyboard", "Playstation 5", "Milk", "Eggs"};

        // does not keep the order --> removes duplicates
        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); // [Magic, Keyboard, Playstation 5, Wand, Wizard Wand, Eggs, Mouse, Car, Pen, Magic Wand, Milk]

        // convert Set to Array --> removes duplicates, keeps the order
        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));



        System.out.println(set1);
        System.out.println(Arrays.toString(arr)); // [Magic Wand, Wand, Magic, Magic, Pen, Car, Mouse, Keyboard, Magic Wand, Wizard Wand, Keyboard, Playstation 5, Milk, Eggs]

        // keeps the order --> removes duplicates
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set2); // [Magic Wand, Wand, Magic, Pen, Car, Mouse, Keyboard, Wizard Wand, Playstation 5, Milk, Eggs]

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        // LinkedHashSet is used to remove duplicated elements which then is converted to ArrayList and updated as list
        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list); // output --> [1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]

        list = new ArrayList<>(new TreeSet<>(list));

        System.out.println(list); // output --> [10, 20, 30, 40, 200, 300, 400, 500, 600, 1000]

        System.out.println("------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();

        s.addAll(Arrays.asList(array));

        System.out.println("------------------------------------");

        /*
        Given:
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        return fifth element after removing the duplicates
        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>( Arrays.asList(nums) ).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("------------------------------------");

        String str = "aaaabbbbccccdddeeeee";

        // eabcd
        // 54443
        // e5a4b4c4d3

        String result = "";    // e5a4b4c4d3

        // linked hash set is used to remove duplicates, elements separated by space
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

           int count = Collections.frequency( Arrays.asList(str.split("")), each );

           result += each+count;

        }

        System.out.println(result); // a4b4c4d3e5

        System.out.println("------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Cigdem", "Smyrna", "Maya", "Limon"));

        System.out.println(names.toArray(new String[0])[2]); // returns 2nd element --> Maya

        System.out.println(new ArrayList<>(names).get(3)); // returns 3rd element --> Limon

        for (String each : names) {
            System.out.println(each); // Cigdem Smyrna Maya Limon
        }





    }


}
