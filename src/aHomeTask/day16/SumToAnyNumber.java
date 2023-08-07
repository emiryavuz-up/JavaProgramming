package aHomeTask.day16;

public class SumToAnyNumber {

    public static void main(String[] args) {

        int sum = 0;
        int givenNr = 13313;
        for (int i = 1; i <= givenNr; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
 */