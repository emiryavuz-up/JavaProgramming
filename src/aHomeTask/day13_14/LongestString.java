package aHomeTask.day13_14;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        /*
        write a program that asks user to enter two strings, and print out the longest string
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first strings");
        String first = scan.nextLine();

        System.out.println("Enter your second string");
        String second = scan.nextLine();

        scan.close();


        if(first.length() > second.length()){
            System.out.println(first);

        }else if(second.length() > first.length()){
            System.out.println(second);

        }else{
            System.out.println("Both of them the same");
        }

    }
}
