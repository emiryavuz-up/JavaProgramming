package day08_IfStatements;

public class SelfStudy {

    public static void main(String[] args) {

    /*
    Exercise 1:
Write a program that takes two numbers as input and determines which one is greater. Display the result to the user.

Exercise 2:
Write a program that calculates the area of a rectangle. Ask the user to enter the length and width of the rectangle and display the calculated area.

Exercise 3:
Write a program that checks whether a given number is even or odd. Ask the user to enter a number and display whether it is even or odd.

     */

        int number1 = 20;
        int number2 = 8626923;

        boolean isBigger = number1 >= number2;
        boolean isSmaller = number1 <= number2;

        System.out.println("Is Bigger : " + isBigger);
        System.out.println("Is Smaller : " + isSmaller);

        System.out.println("---------------------------------------------------------------");

        // Exercise 2: If statements, operators, variables, concatenation, casting types.

        int number3 = 136316;

        if(number3 % 2 == 0){
            System.out.println("Even Number");
        }
        if(number3 % 2 == 1){
            System.out.println("Odd Number");
        }

        /*
you have two variables, a and b. a is an integer and b is a string. Write a Java statement that concatenates a and b and assigns the result to a string variable c.
         */

        int a = 55;
        String b = "1AA64";
        String c = a + b;
        System.out.println("c = " + c);

    }

}
