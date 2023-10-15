package aHomeTasks.day18;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Which bedroom do you want to reserve?");
        String roomType = scan.nextLine().toLowerCase(); // king bed ==> 120

        System.out.println("How many nights will you stay?"); // 5 nights
        int nights = scan.nextInt(); // 120 x 5 = totalprice


        scan.nextLine();

        System.out.println("Would you like to reserve another room?");
        String yesNo = scan.next().toLowerCase();

        while (yesNo.equals("yes")) {
            System.out.println("Which bedroom do you want to reserve?");
            roomType = scan.nextLine().toLowerCase();

            System.out.println("How many nights will you stay?");
            nights = scan.nextInt();

            System.out.println("Would you like to reserve another room");
            yesNo = scan.next().toLowerCase(); // yes haricinde bir sey girilirse yesNo yu update le

            }

        int king = 120;
        int queen = 100;
        int single = 80;
        int result = 0;

        while(yesNo.equalsIgnoreCase("yes") && roomType.equalsIgnoreCase("king bed")){
            result = king * nights;
        }


        if(yesNo.equalsIgnoreCase("no")){

            if(roomType.equalsIgnoreCase("king bed")){
                result += nights * king;
            }else if(roomType.equalsIgnoreCase("queen bed")){
                result += nights * queen;
            }else if(roomType.equalsIgnoreCase("single bed")){
                result += nights * single;
            }

            System.out.println(result);
            scan.close();

        }

    }
}








/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve,
            and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user
            	 provides a valid entry

 */