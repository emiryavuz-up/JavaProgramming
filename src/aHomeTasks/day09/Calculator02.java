package aHomeTasks.day09;

public class Calculator02 {

    public static void main(String[] args) {

/*
Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */

        double n1 = 10;
        double n2 = 20;
        char mathOperator = '+';

        if        (mathOperator == '+') {
            System.out.println("The addition is: " + (n1 + n2));
        } else if (mathOperator == '-') {
            System.out.println("The subtraction is: " + (n1 - n2));
        } else if (mathOperator == '*') {
            System.out.println("The multiplication is: " + (n1 * n2));
        } else if (mathOperator == '/') {
            System.out.println("The division is: " + (n1 / n2));
        } else{
            System.out.println("Invalid Operator");
        }

    }
}
