package day11_SwitchScanner;

public class Calculator {

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

        // NESTED IF AND SWITCH IS MIXED TOGETHER IN THE BELOW EXAMPLE

        // YOU MAY NEED TO DO THIS FOR CERTAIN TASKS

        double n1 = 200.5;
        double n2 = 10.333334214245;

        char operator = '-';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        String result = "";


        if(valid){

            switch (operator){

                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;

                default:
                    System.out.println(n1 / n2);

            }



        }else{
            System.err.println("Invalid Operator: " +operator);
        }


    }
}
