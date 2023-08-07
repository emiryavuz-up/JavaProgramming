package aHomeTask.day17;

import java.util.Scanner;

public class RoomReservation02 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int totalPrice = 0; // there will be a total price to be printed so 0 is given to this to be updated later

        while (true) {

            System.out.println("Do you want to reserve a room?");


            System.out.println("\t\t King Bed ==> 120$");
            System.out.println("\t\t Queen Bed ==> 100$");
            System.out.println("\t\t Single Bed ==> 80$");

            String answer = scan.nextLine().toLowerCase();

            System.out.println("Do you want to reserve a room?");
            String yesNo = scan.nextLine().toLowerCase();

            while( !(yesNo.equals("yes") || (yesNo.equals("no")))  ){

                System.out.println("Which room do you want to reserve?");
                System.out.println("Have a nice day");
                answer = scan.next().toLowerCase();
            }

            while (!(answer.equals("king bed") || answer.equals("queen bed") || answer.equals("single bed"))) {

                System.out.println("Invalid room, please re-enter");

                answer = scan.nextLine().toLowerCase();


            }

            totalPrice += (answer.equals("king bed"))? 120 : (answer.equals("queen bed"))? 100 : 80;


scan.close();
        }

    }

}

/*
Create a class called RoomReservation, write a program for the room reservation,
your program asks if the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    	(if user entered any invalid answer (other than yes/no) ask user to reenter
    	until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

        the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user
             provides a valid entry)

 */

/*
System.out.println("Which room do you want to reserve?");


        System.out.println("\t\t King Bed ==> 120$");
        System.out.println("\t\t Queen Bed ==> 100$");
        System.out.println("\t\t Single Bed ==> 80$");

        String word = scan.nextLine().toLowerCase();



        while(!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))){

            System.out.println("Invalid room, please re-enter");

            word = scan.nextLine().toLowerCase();


        }

        totalPrice += (word.equals("king bed"))? 120 : (word.equals("queen bed"))? 100 : 80;

        System.out.println("Your total price is: $" + totalPrice);
        scan.close();

        }
 */