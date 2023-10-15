package aHomeTasks.aInterviewQuestions.solvedQuestions;

import java.util.Scanner;

public class NumbersFrom1TillUpperBound {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Creating a new Scanner object to read user input.

        System.out.println("Enter a valid upper bound: "); //Prompting user to enter an upper bound.

        int upperBound = scan.nextInt(); //Reading the input upper bound from the user.

        int sum = 0; //Initializing sum to 0. This variable will store the total sum of numbers.

        boolean check = true; //Initializing a control variable for the outer loop.

        //This loop will continue until 'check' becomes false.
        for (; check; ) {

            //Checking if the entered upper bound is a valid number (greater or equal to 1).
            if (upperBound >= 1) {

                //If valid, sum up all the numbers from 1 to the entered upper bound.
                for (int i = 1; i <= upperBound; i++) {
                    sum += i; //Adding the current number 'i' to 'sum'.
                }

                check = false; //Setting 'check' to false, to exit the outer loop.

            } else {
                //If the entered upper bound is not valid, ask the user to enter a valid number again.
                System.out.println("Please enter a valid number again");

                //Reading the new upper bound from the user.
                upperBound = scan.nextInt();
            }
        }
         scan.close();

        //Printing the total sum of numbers.
        System.out.println("Summary of numbers = " + sum);
    }
}