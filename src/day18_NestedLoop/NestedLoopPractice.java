package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age"); // 1 ~ 120
            int age = scan.nextInt();

            while (!(age > 0 && age <= 120)) {
                System.err.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }

            // after this something else is connected

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase(); // ignored case sensitivity for the input

            while( !(a.equals("yes") || a.equals("no"))  ){ // while the answer is invalid
                System.err.println("Invalid Entry, Please Re-enter, Would you like to continue?");
                a = scan.next().toLowerCase(); // one variable designed to get the answer from the user
            }


            if(a.equals("no")){
                break; // given within the outer loop to exit the loop if the answer is no!!
            }



        }
scan.close();

    }
}