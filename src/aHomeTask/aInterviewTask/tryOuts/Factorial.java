package aHomeTask.aInterviewTask.tryOuts;

public class Factorial {

    public static void main(String[] args) {

        int i, factorial = 1; // i: will be used in the loop , factorial is 1 to multiply the current value of factorial by each number from 1 to the given number.

        int number = 5;

        for (i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


    }
}
