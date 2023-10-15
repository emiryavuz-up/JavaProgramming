package aHomeTasks.day17;

import java.util.Scanner;

public class TwoNumberAndOperator {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number");
        int number = scan.nextInt();
        System.out.println("Enter second number");
        int number2 = scan.nextInt();
        System.out.println("Enter math operator");
        char operator = scan.next().charAt(0);

        while ( !(operator == '+' || operator == '-' || operator == '*' || operator == '/') ) {
            System.err.println("Invalid operator, re-enter the operator.");
            operator = scan.next().charAt(0);
        }
            int sum = 0;

            if(operator == '+'){
               sum = number+number2;
            }else if(operator == '-'){
                sum = number-number2;
            }else if(operator == '*'){
                sum = number*number2;
            }else{
                sum = number/number2;
            }

        System.out.println(sum);
        scan.close();

            }

        }





/*
        write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /)
 */