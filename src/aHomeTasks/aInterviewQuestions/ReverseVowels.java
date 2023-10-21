package aHomeTasks.aInterviewQuestions;

import org.w3c.dom.ls.LSOutput;

public class ReverseVowels {

    //4.Write a method reverseVowels() that will return a string with reversed vowels.
    public static String reverseVowels4(String str) {

        char[] array = str.toCharArray();
        int j = 0;

        String vowels = "";

        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                j++;
                vowels += array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) array[i] = vowels.charAt(--j);
        }
        return String.valueOf(array);
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return "ae".indexOf(c) != -1;
    }

    public static void main(String[] args) {

        System.out.println(reverseVowels4("apple"));

    }

}


/*
        String reversedVowels = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reversedVowels += str.charAt(i);
        }
        return reversedVowels;
    }


    public static void main(String[] args) {

        System.out.println(reverseVowels("apple"));

    }


         */