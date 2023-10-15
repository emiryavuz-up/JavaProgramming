package aHomeTasks.day17;

import java.util.Scanner;

public class SumOfGivenNr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */


        int sum = 0;
        System.out.println("Enter a number");
        int givenNr = scan.nextInt();

        while(givenNr > 0){
            sum += givenNr; // if givenNr is positive, add it to sum
            System.out.println("Enter a number"); // ask the user for the next number
            givenNr = scan.nextInt(); // update givenNr with the new number // exit infinite loop
        }
        System.out.println(sum);
scan.close();
    }

    }

