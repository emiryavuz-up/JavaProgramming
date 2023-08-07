package aHomeTask.aInterviewTask;

import java.util.Arrays;

public class Anagram_Interview {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        // write a program that can check if str1 and str2 are built out of same characters = anagram

        // since we can apply sort only to array
        // we create two different arrays first for the 2 strings above with char to get each character

        char[] ch1 = str1.toCharArray(); // all characters of str1
        char[] ch2 = str2.toCharArray(); // all characters of str2

/*
        System.out.println(Arrays.toString(ch1)); // [a, c, d, b]
        System.out.println(Arrays.toString(ch2)); // [a, c, d, b]
*/

        Arrays.sort(ch1); // sorts ch1 in ascending order
        Arrays.sort(ch2); // sorts ch2 in ascending order

        /*
        System.out.println("---------------------------------");

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
*/

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);
        
    }

}
