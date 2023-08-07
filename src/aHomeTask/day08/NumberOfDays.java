package aHomeTask.day08;

/*
	3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;   // 11 ~ 12
        // these are the conditions!!!!
        boolean has28Days = number == 2; // for the month that has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;  // for the months that has 30 days
        boolean has31Days = !has28Days && !has30Days; // automatically makes the months one of those have 31

        // this is the execution based on conditions!!!

        if(has28Days){
            System.out.println("Has 30 Days");
        }
        if(has30Days){
            System.out.println("Has 30 Days");
        }
        if(has31Days){
            System.out.println("Has 31 Days");
        }

        }

    }




