package aHomeTasks.day12;

import java.util.Scanner;

public class PlaceAnOrder02 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name");
        String product = scan.nextLine();

        System.out.println("Enter the price");
        int price = scan.nextInt();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Enter your first name");
        String firstName = scan.next();

        double totalPrice = quantity * price;

        System.out.println("");

        scan.close();

    }

}
