package day08_IfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

/*
        System.out.println("Odd Number"); // if its odd number this should print true

        System.out.println("Even Number"); // if its even number this should print false


      if statements:
     single if : one possible outcome
      multibranch if : more than one possible outcome
     nested if


    }
 */
        int number = 300;

        boolean evenNumber = number % 2 == 0; // this means it's an even number
        boolean oddNumber = !evenNumber; // not even number

        if (evenNumber) { // true
            System.out.println(number + " is even number");
        }

        if (oddNumber) { // false
            System.out.println(number + " is odd number");
        }

        int n = 0;

        //positive
        //negative
        //zero

        if (n > 0) { // n is greater than zero // is it a positive number
            System.out.println(n + " is positive");
        }
        if (n < 0) { // n is less than zero // is it a negative number
            System.out.println(n + " is negative");
        }
        if (n == 0) { // // is it zero
            System.out.println(n + " is zero");
        }


    }
}