package aHomeTasks.day17;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String yesNo = scan.next().toLowerCase();

        scan.nextLine();

        if(yesNo.equals("yes")){
            System.out.println("Which type of room do you want to reserve");
            String room = scan.nextLine();

            if(room.equalsIgnoreCase("King bed")){
                System.out.println("King Bed ==> 120$");
            }else if(room.equalsIgnoreCase("Queen Bed")){
                System.out.println("Queen Bed ==> 100$");
            }else{
                System.out.println("Single Bed ==> 50$");
            }

        }else{
            System.out.println("Have a nice day.");
        }

        while( !(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no") )){

            if( !(yesNo.equalsIgnoreCase("no"))  )
            System.out.println("Re-enter");
            String enter = scan.nextLine();
        }




        scan.close();
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