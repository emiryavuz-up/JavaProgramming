package day07_Operators;

public class Castings {

    public static void main(String[] args) {
/*
 What we have learned so far:
		1. main method
		2. print() & println()
		3. escape sequences
		4. primitives & String variables
		5. Concatenation
		6. Castings (explicit)
		
        Warmup tasks:
        1. create a class named Castings
        1.1 declare a variable of float named averageScore and initialize it to 20.5
        1.2 declare the following variables and assign averageScore to each of them:
        byte num1;
        short num2;
        int num3;
        long num4;
        float num5
        double num6;
 */

        float averageScore = 20.5F; // explicit casting. needed when assigning a large nr to a smaller one

        byte num1 = (byte) averageScore;

        short num2 = (short) averageScore; // just press ALT + ENTER AND THEN ASSIGN

        int num3 = (int) averageScore;


        float num4 = averageScore; // there is no casting

        double num5 = averageScore; // IMPLICIT CASTING // smallar to a larger type

        long num6 = (long) averageScore; // EXPLICIT CASTING AUTOMATIC

        System.out.println("num1 = " + num1 + num2 + num3 + num4);

        System.out.println("num1 = " + num1);



    }


}
