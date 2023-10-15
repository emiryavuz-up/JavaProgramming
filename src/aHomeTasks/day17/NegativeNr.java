package aHomeTasks.day17;

import java.util.Scanner;

public class NegativeNr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){


            int sum = 0;
            System.out.println("Enter a number");
            int number = scan.nextInt();

            while(number > 0 ){
                sum += number;
                System.out.println("Enter a number");
                number = scan.nextInt();

            }
            System.out.println(sum);

            if(number < 0){
                break;
            }
            

        }
scan.close();
    }

}

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */