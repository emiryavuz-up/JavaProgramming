package aHomeTasks.day12;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed:");

        int variable = scan.nextInt();
        scan.close();

        String result = "";

        if(variable > 55){
            result = "You're driving 50 mph over the limit. Slow Down!";
        }
        System.out.println(result);

    }


}
        /*
        Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
         */
