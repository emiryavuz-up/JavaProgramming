package aHomeTasks.day05;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 15315;
        int secondNumber = 2120;
        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;


        // 100 + 50 = 150
        // 100 - 50 = 50
        // 100 * 50 = 5000

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) );
        System.out.println(firstNumber + " - " + secondNumber + " = " + (substraction));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (multiplication));
    }
}
