package aHomeTasks.day12;

import java.util.Scanner;

public class CentsToDollar02 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Cents");
        int cents = scan.nextInt();
        scan.close();
        int dollars = cents / 100;
        cents -= dollars * 100; // 100 ile carp ve kalanini cents e geri ver. to find the remainder

        //cents -= dollars * 100, it means "subtract dollars * 100 from cents,
        // and then store the result back into cents".
        //So, it's like saying "I have 250 cents, I subtract 200 cents (which is 2 dollars),
        // and then I'm left with 50 cents".
        // So, cents would now have a value of 50.
        /*
        Now, the expression "cents -= dollars * 100" subtracts the amount you want to take away (in cents)
        from your total amount (also in cents). In our example, you have 250 cents in total,
        you want to take away 200 cents.
        So, you subtract 200 from 250, which gives you 50.
        This means you're left with 50 cents after you've taken away 2 dollars.
         */

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + cents + " cents");


    }

}
