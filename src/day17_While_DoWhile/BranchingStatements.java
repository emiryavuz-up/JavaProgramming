package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++){

            System.out.print(i+ " ");

            if(i == 'F'){
                break;  // exits the loop // forces the loop to be terminated
            }

        }

        System.out.println();

        System.out.println("---------------------------------------------");

        Scanner scan = new Scanner(System.in);


        while(true){

            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            if(number < 0){
                break; // this infinite loop will only stop when the user enters a negative number
            }

        }
scan.close();
    }

}
