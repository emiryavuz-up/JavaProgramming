package aHomeTask.day12;

import java.util.Scanner;

public class People {

    public static void main(String[] args) {

        /*
        Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

         */



        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with");
        scan.nextInt();

        int num = scan.nextInt();
        String result = "";

        if(num >= 3 && num <= 6){

            if(num < 3){
                result = "Live with less than 3 people";
            }else if(num >= 3 && num <= 6){
                result = "Live with 3-6 people";
            }else {
                result = "Live with more than 6 people";
            }


        }else{
            result = "Invalid Input";
        }

        System.out.println(result);

        scan.close();





        /*
        System.out.println("Enter a number between 1 to 7:");
        scan.nextInt(); // nothing will be displayed, its used only for user to enter an input.
        // so treat it as the input user provided
        // assign it to a data type to be able to use it again. REUSABLE. RE-USE - USE AGAIN

        int num = scan.nextInt(); // BYTE CAN BE CASTED TO INT WHEN USING!!!!!!!!!

        String result = "";

        if(num >= 1 && num <= 7){
            // 1 ~ 7
         */
        /*

         */





    }

}
