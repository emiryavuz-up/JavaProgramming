package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        // Manually throw an exception

        System.out.println("Enter your age:");

        int age = new Scanner(System.in).nextInt();

        /*
         if(age < 0){
            System.err.println("Invalid Age" + age);
            System.exit(1);
        }
         */

        // It is better if we throw an exception

        if(age < 0){
            throw new InputMismatchException("Age can not be negative." + age); // terminates the program
            // much more understandable compared to the exit method
        }


        if(age > 21){
            System.out.println("You are eligible.");
        }else{
            throw new RuntimeException("You must be at least 21 years old.");
        }



    }

}
