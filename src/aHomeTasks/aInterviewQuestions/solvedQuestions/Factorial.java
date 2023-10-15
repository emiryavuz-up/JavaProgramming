package aHomeTasks.aInterviewQuestions.solvedQuestions;

public class Factorial {

    public static void main(String[] args) {

        /*
        int num = 5;
        
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }

        System.out.println(factorial);
        
    }

         */


        int i, factorial = 1;

        int number = 5;

        for (i = 1 ; i <= number; i++ ){

            factorial = factorial * i ;
        }

        System.out.println("Factorial of 5 is " + factorial);

    }
}

/*
Story Title : Factorial Program using loop 


Output:

Factorial of 5 is: 120
 */