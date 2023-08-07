package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) { // outer loop   // to repeat the codes below // true keyword = infinite loop

            System.out.println("Enter a number"); // ask the number
            int num = scan.nextInt(); // get the number

            if (num % 2 == 0) { // if the given number is divisible by 0
                System.out.println(num + " is even number"); // print even number
            } else {
                System.out.println(num + " is odd number"); // otherwise, print odd number
            }

            System.out.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase(); // answer taken in lowercase as a string

            while( !(answer.equals("yes") || answer.equals("no"))  ){ // repeatedly asks in case answer is not yes or no
                System.err.println("Please re enter, Would you like to enter another number?");
                answer = scan.next().toLowerCase();
            }

            if(answer.equals("no")){ // to make sure outer loop eventually exits when the answer is equal to no
                break;
            }


        }

scan.close();

    }

}

/*
     if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */