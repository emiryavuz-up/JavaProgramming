package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {


    public static void main(String[] args) {


        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println();

        System.out.println("-------------");

        String s1 = "Simushy";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("---------------------");

        String word = "Level";

        StringUtility.isPalindrome(word);

       boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("Is the word palindrome? " + palindrome);

        System.out.println("--------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "CodeBastards"};

        int count = 0;

        for (String each : names) {

            if(StringUtility.isPalindrome(each));
            count++;
        }

        System.out.println(count);



        String str2 = "aaabbcdefg";

        String nonDup = StringUtility.removeDuplicates(str2);

        System.out.println(nonDup);

    }



}


