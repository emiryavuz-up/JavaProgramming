package aHomeTasks.day13;

import java.util.Scanner;

public class CheckWords {

    /*
    Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st word:");
        String input1 = scan.nextLine();

        System.out.println("Enter 2nd words:");
        String input2 = scan.nextLine();

        System.out.println("Enter 3rd words:");
        String input3 = scan.nextLine();

        String result = "";

        if (input1.length() == input2.length() && input1.length() == input3.length()) {
            result = "All words are the same length";
        } else if(input1.length() == input2.length() || input1.length() == input3.length() || input2.length() == input3.length()){
            result = "Not Same nor Different lengths";
        }else{
            result = "All different lengths";
        }
        System.out.println(result);
scan.close();





    }




    }

