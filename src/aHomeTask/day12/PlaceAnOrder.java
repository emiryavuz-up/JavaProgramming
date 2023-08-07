package aHomeTask.day12;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        /*
         PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

         */

        Scanner scan = new Scanner (System.in);
        String result = "";


        System.out.println("Enter the product name");
        String product = scan.nextLine();

        System.out.println("Enter the price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Enter your first name");
        String name = scan.next();

        double total = price * quantity;


        System.out.println(name + ", your order for " + quantity + " " + product + " has been placed. Your total is " + total);

        scan.close();

    }


}
