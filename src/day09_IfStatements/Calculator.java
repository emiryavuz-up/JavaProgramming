package day09_IfStatements;

public class Calculator {

    public static void main(String[] args) {

        /*
        Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,

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

        double n1 = 20;
        double n2 = 20;
        char mathOperator = '-';

        if (mathOperator == '+') {
            System.out.println("Result of addition: " + (n1 + n2));
        } else if (mathOperator == '-') {
            System.out.println("Result of substraction: " + (n1 - n2));
        } else if (mathOperator == '*') {
            System.out.println("Result of multiplication: " + (n1 * n2));
        } else if (mathOperator == '/') {
            System.out.println("Result of division: " + (n1 / n2));
        }else{
            System.out.println("Invalid");
        }


    }


}
