package aHomeTask.aInterviewTask.tryOuts;

import java.util.Arrays;

public class Anagram {

        public static void main(String[] args) {

            String str1 = "AC DB";
            String str2 = "dbca";

            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            char[] ch1 = str1.toCharArray(); // all characters of str1
            char[] ch2 = str2.toCharArray(); // all characters of str2

            Arrays.sort(ch1); // sorts ch1 in ascending order
            Arrays.sort(ch2); // sorts ch2 in ascending order

            boolean anagram = Arrays.equals(ch1, ch2);

            System.out.println("anagram = " + anagram);
        }

    }


/*

 */