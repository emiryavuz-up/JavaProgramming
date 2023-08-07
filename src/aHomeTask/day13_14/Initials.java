package aHomeTask.day13_14;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*
        write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your second name");
        String secondName = scan.nextLine();

        char first = firstName.toUpperCase().charAt(0);
        char second = secondName.toUpperCase().charAt(0);

        String result = first + "." + second;

        System.out.println(result);
scan.close();

    }


}
