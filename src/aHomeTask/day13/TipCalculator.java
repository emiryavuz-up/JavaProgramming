package aHomeTask.day13;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount");
        double checkAmount = scan.nextDouble();

        System.out.println("How was the service quality (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next().toLowerCase();

        double tipRate = (quality.equals("Excellent"))? 0.25 : (quality.equals("Great")? 0.2
                : (quality.equals("Good")? 0.15 : (quality.equals("Fair")? 0.1 : 0.05)));

        //: (quality.equals("Great")? ELSE IF BLOCK

        double totalTip = checkAmount * tipRate;


        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Total Pay: " + checkAmount);
        System.out.println("Total Tip: " + totalTip);

        if(split.equals("yes")){
            System.out.println("Total per person: " + (checkAmount / numberOfPeople));
            System.out.println("Tip per person: " + (totalTip / numberOfPeople));

            if(split.equals("no")){
                System.out.println("");
            }
        }
        scan.close();
    }

}

/*
class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and
 if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),
	Number of people entered: (number) (each person = & in output)
	Check amount: (number)
    Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75
	HINT: you will need to use .equals() method
 */