package aHomeTasks.day12;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares you have already?");
        int totalShares = scan.nextInt();

        if (totalShares > 0) {
            System.out.println("How much your total value in the stock market is?");
            double stockMarket = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company your have the most shares in?");
            String mostShares = scan.nextLine();
            String result = "";
            result = "Your total stock market is holding is " + stockMarket + " which is made up of " + totalShares + ". " + mostShares + " is your company holdings";
            System.out.println(result);

            scan.close();

        }

    }


}
/*
StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */