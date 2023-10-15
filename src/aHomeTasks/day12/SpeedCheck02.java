package aHomeTasks.day12;

import java.util.Scanner;

public class SpeedCheck02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speedLimit = 55;
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();
        scan.close();

        int overLimit = currentSpeed - speedLimit;

        if(overLimit > 0 ){
            System.out.println("You are driving " + overLimit + " mph over the limit. Slow Down!");

        }

    }

}
