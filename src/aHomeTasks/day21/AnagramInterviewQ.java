package aHomeTasks.day21;

import java.util.Arrays;

public class AnagramInterviewQ {

    public static void main(String[] args) {

        // write a program that can check if the given 2 strings are anagram

        String str1 = "heart";
        String str2 = "earth";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("Are the given words anagram? \n" + anagram);



    }

}
