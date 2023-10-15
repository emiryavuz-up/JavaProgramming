package aHomeTasks.day18;

import java.util.Scanner;

public class RoomReservation02 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;

        while(true){

            System.out.println("Which room would you like to reserve?");
            System.out.println("Which room would you like to reserve?");
            System.out.println("Which room would you like to reserve?");
            System.out.println("Which room would you like to reserve?");

            String a = scan.nextLine().toLowerCase();

            while( !(a.equals("king bed") || (a.equals("queen bed") || (a.equals("single bed")))) ){
                System.out.println("Invalid Entry, Please Re-enter");
                a = scan.nextLine().toLowerCase();
            }

            totalPrice += (a.equals("king bed"))? 120 : (a.equals("queen bed"))? 100 : 80;

            System.out.println("Would you like to reserve another room?");
            String answer = scan.next().toLowerCase();

            while( !(answer.equals("yes")) || answer.equals("no")) {
                System.out.println("Invalid Entry, Please Re-enter");
                System.out.println("Would you like to reseve another room?");
                answer = scan.next().toLowerCase();
            }


            if(answer.equals("no")){
                System.out.println("Your total price is: " + totalPrice);
                break;
            }



        }

        scan.close();
    }


}
