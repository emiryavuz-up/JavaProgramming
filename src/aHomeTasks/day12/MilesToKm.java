package aHomeTasks.day12;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        /*
        Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles:"); // first thing user will see
        double miles = scan.nextDouble(); // user input. which is double to cover decimals as well
        double km = miles / 0.62; // this is the formula behind the converting
        String result = ""; // this is to write it down easily below:

        result = miles + " miles equal to " + km + " kilometers";

        System.out.println(result);

        scan.close();

    }

}
