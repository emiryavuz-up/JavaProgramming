package day15_ForLoop;

import java.util.Scanner;

public class ReplaceFirst {

    public static void main(String[] args) { // string is immutable

        System.out.println("Enter a word"); // "xcodex"
String word = new Scanner(System.in).next(); // scanner constructor added here because it will be used once!
                                                     // for only one input, scanner can be used without a name

        if(word.charAt(0) == 'x' ){// if int use == if string use .equals
           word = word.replaceFirst("x", "a"); //new string object will be created = "acodex"

        }

        System.out.println(word);
    }

}

/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with "a".
                    Input:
                        xcodex
                    Output:
                        acodex

 */