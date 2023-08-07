package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // no need to repeat this so its out of the for loop statement

        int max = -2147483648; // this is the minimum int can take. so anything above is maximum!!!!!
        // any user entered number will be greater than -2147483648

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt(); // 1, 2, 3, 4, 5

            if(num > max){
                max = num; // continuously re-assigning the value to a greater nr which will become -21474...
                          // if the user entered number is greater than current maximum number
                         // only the greater number will be assigned to max
            }
        }
        System.out.println("max nr: " + max);
scan.close();
    }

}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */