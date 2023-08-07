package aHomeTask.day16;

import java.util.Scanner;

public class PositiveNegative {


    public static void main(String[] args) {
/*


        Scanner scan = new Scanner(System.in);


            System.out.println("Enter number:");
            int input = scan.nextInt();

        int negative = 0;
        int positive = 0;

        for(int i = 0; i < 5; i++){

            if(input < 0){
                negative += input;
            }else{
                positive += input;
            }

        }

        System.out.println(positive + " " +negative);


scan.close();
 */


        Scanner scan = new Scanner(System.in);



        int countPos = 0;
        int countNeg = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number > 0) {
                countPos++;
            } else if (number < 0) {
                countNeg++;
            }
        }

            System.out.println(countPos + " positive and " + countNeg + " negative");


            // if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
            //               frequency++;


scan.close();

    }
}
/*
1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */