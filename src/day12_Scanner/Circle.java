package day12_Scanner;

import java.util.Scanner;

/*

    1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");

        double result = scan.nextDouble(); // SCANNER METHOD. IF YOU ARE SURE
        // THE ONE THAT IS USED LAST. CLOSE IT THERE!!!
        // IF NOT CLOSE IT IN THE BEGINNING

        double area = result  * result * 3.14;
        double perimeter = 2 * result * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();

    }


}
