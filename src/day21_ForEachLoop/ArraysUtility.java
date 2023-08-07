package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums); // hashcode
        System.out.println(Arrays.toString(nums)); // {1, 2, 3, 4, 5}

        System.out.println(nums[0]); // this is an element contained in the array, not the array itself
                                    // it's int in this example so, it can be printed out normally

        System.out.println("--------------------------------------------------------");


        int[] scores = {95, 100, 55, 65, 85, 78};
        System.out.println(Arrays.toString(scores)); // [95, 100, 55, 65, 85, 78]


        Arrays.sort(scores); // ascending order of scores array
        System.out.println(Arrays.toString(scores)); // [55, 65, 78, 85, 95, 100]


        System.out.println("Min Score: " + scores[0]); // first character
        System.out.println("Max score: " + scores[scores.length-1]); // last character

        String[] names = {"Tenna","Anna", "Zenna", "Denna", "Annz", "Henna", "Jenna", "Lenna"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); // a ~ z, array names printed out in ascending order

        String[] words = {"ANNA", "Anna"}; // [ANNA, Anna] // it follows ascii table,
                                    // uppercase letters (on the ascii table) starts from 65 == smaller
                                    // lowercase letters (on the ascii table) starts from 97 == bigger

        System.out.println(Arrays.toString(words)); // [ANNA, Anna]

        System.out.println("--------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        Arrays.equals(arr1, arr2); // compares the elements of arrays in each index otherwise its false

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println("arr1 equals to arr2? " + r1);

        Arrays.sort(arr1); // ascending order of arr1 = {1, 2, 3};
        Arrays.sort(arr2); // ascending order of arr2 = {1, 2, 3};


        boolean r2 =  Arrays.equals(arr1, arr2); // are ascending order of the 2 arrays equal to each other?

        System.out.println(r2); // true


        char[] ch1 = {'a', 'c', 'b',};

        char[] ch2 = {'b', 'a', 'c', };

        Arrays.sort(ch1); // {a, b, c};
        Arrays.sort(ch2); // {a, b, c};

        boolean anagram = (Arrays.equals(ch1, ch2));

        System.out.println("anagram: " + anagram); // true





        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
        */

    }

}
