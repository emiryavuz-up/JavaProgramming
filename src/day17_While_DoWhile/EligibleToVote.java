package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt(); // valid is age is between 1~120, otherwise print invalid number, try again
        // until user provides the valid age, invalid statement will be repeated.
        // since we don't know the exact number of times of repeating
        // we use while as below
        // repeating a statement unknown number of times // no specific number for repetition

        while(  !(age >= 1 && age <= 120)  ){ // exclamation mark used to make it opposite of valid numbers
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String usCitizen = scan.next();

        while( !(usCitizen.equalsIgnoreCase("yes") || usCitizen.equalsIgnoreCase("no")) ){
            System.err.println("Invalid entry, please re- enter");
            System.err.println("Are you a US citizen? yes/no");
            usCitizen = scan.next().toLowerCase();
        }

        if(age >= 18 && usCitizen.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");

        }else{
            System.out.println("Not eligible to vote");
        }
scan.close();
    }

}
