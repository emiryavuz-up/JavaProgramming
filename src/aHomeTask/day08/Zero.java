package aHomeTask.day08;

public class Zero {

    /*
Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
Test Data Input a number: 25  Expected Output : Input value: 25  Positive number
     */

    public static void main(String[] args) {

        int number = -1;

        if (number == 0){
            System.out.println("Zero");
        }
        if (number != 0 && number >= 0){
            System.out.println("Positive Number");
        }
        if (number !=0 && number <= 0){
            System.out.println("Negative Number");
        }
        if (number % 2 == 1){
            System.out.println("Odd");
        }
        if(number % 2 == 0){
            System.out.println("Even");
        }







    }


}
