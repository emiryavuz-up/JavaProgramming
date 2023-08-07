package aHomeTask.aInterviewTask; //This is the package name.

import java.util.Scanner; //Importing the Scanner class from the Java standard library. Scanner is used to read user input.

public class FibonacciSequence { //This is the start of our class named 'FibonacciSequence'.

    public static void main(String[] args) { //This is the main method where the execution of the program starts.

        Scanner scan = new Scanner(System.in); //Creating a new Scanner object that reads from the standard input stream (keyboard).

        System.out.println("What is the fibonacci term number"); //Asking the user to input the term number for Fibonacci series.

        int n = scan.nextInt(); //Reading the user's input and storing it into the integer 'n'.

        int num1 = 0, num2 = 1; //Initializing the first two numbers of the Fibonacci series.

        int sum; //Variable 'sum' declaration that will store the sum of 'num1' and 'num2' in each iteration.

        //Building the starting string for our Fibonacci series. It always starts with '0' and '1'.
        String series = "" + num1 + " " + num2 + " ";

        //A 'for' loop that iterates from 2 to 'n'. Starts from 2 because we already have first two Fibonacci numbers.
        for( int i=2; i <= n; i++ ){

            sum = num1 + num2; //Adding 'num1' and 'num2' and storing the result in 'sum'.

            num1 = num2; //The value of 'num2' is assigned to 'num1'.

            num2 = sum; //The value of 'sum' is assigned to 'num2'.

            //Appending each new term of the Fibonacci sequence to the 'series' string.
            series += sum + " ";
        }

        System.out.println("series = " + series); //Printing the Fibonacci series up to the 'n'th term.

        System.out.println("final number the sequence is = " + num2); //Printing the last term of the Fibonacci sequence.

        scan.close();

    }
}


/*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 Write a program to print
         Fibonacci series of n terms         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
        This is a example of Fibonacci series of 6 terms

        term number     0   1   2   3   4   5   6  7
        Actual value    0,  1,  1,  2,  3,  5,  8  13
                          num1    num2     sum
        iteration 1         0   +   1   =   1
        iteration 2         1   +   1   =   2
        iteration 3         1   +   2   =   3
        iteration 4         2   +   3   =   5
        iteration 5         3   +   5   =   8
        iteration 6         5   +   8   =   13
        .........         */