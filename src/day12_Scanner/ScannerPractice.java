package day12_Scanner;//import statement needs to be under this package therefore written under this line

import java.util.Scanner; // import java.util.Scanner.*; == imports everything from the package

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);    // argument between paranthesis is what will be the action
              //object
        //what kind of input will you get from the user? if int as an example:

        //since you assigned the object "scan" to the Scanner

        // if you don't have the name of the scanner is not re-usable anymore.
        //which means for each input you need to create one object.
        // when new object is created memory usage increases

        System.out.println("Enter a number between 1 to 7:");
        scan.nextInt(); // nothing will be displayed, its used only for user to enter an input.
        // so treat it as the input user provided
        // assign it to a data type to be able to use it again. REUSABLE. RE-USE - USE AGAIN

        int num = scan.nextInt(); // BYTE CAN BE CASTED TO INT WHEN USING!!!!!!!!!

        String result = "";


        if(num >= 1 && num <= 7){
            // 1 ~ 7
            /*
            switch (num){
                case 1:
                    result = "Monday";
            }
              */
           result = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday" :(num == 4)? "Thursday"
                    :(num == 5)? "Friday" :(num == 6)? "Saturday" : "Sunday";


        }else{
            result = "Invalid Number";
        }
        System.out.println(result);

        scan.close();

    }


}
