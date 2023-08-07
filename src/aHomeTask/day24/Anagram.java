package aHomeTask.day24;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

    boolean areWordsAnagram = anagramCheck("cba", "bac");
        System.out.println(areWordsAnagram);

    }

    public static boolean anagramCheck(String firstWord, String secondWord){

       char[] first = firstWord.toCharArray();
       char[] second = secondWord.toCharArray();


        Arrays.sort(first);
        Arrays.sort(second);

        boolean areWordsAnagram = Arrays.equals(first, second);

        return areWordsAnagram;

    }

}
/*
create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */