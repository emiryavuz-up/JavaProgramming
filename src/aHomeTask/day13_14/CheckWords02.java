package aHomeTask.day13_14;

import java.util.Scanner;

public class CheckWords02 {

    public static void main(String[] args) {

        /*
    Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st word:");
        String firstWord = scan.next();

        System.out.println("Enter the 2nd word:");
        String secondWord = scan.next();

        System.out.println("Enter the 3rd word:");
        String thirdWord = scan.next();
        scan.close();

        String result = "";

        if(firstWord.length() == secondWord.length() && secondWord.length() == thirdWord.length()){
            result = "All words are same length";
        }else if(firstWord.length() == secondWord.length()){
            result = "Not Same nor Different lengths";
        }else if(firstWord.length() == thirdWord.length()){
            result = "Not Same nor Different lengths";
        }else if(secondWord.length() == thirdWord.length()){
            result = "Not Same nor Different lengths";
        }else{
            result = "All different length";
        }

        System.out.println(result);



    }

}
