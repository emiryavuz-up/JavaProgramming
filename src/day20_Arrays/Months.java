package day20_Arrays;

import java.util.Arrays;

public class Months {

    public static void main(String[] args) {


        //give name of the month based on its number
        // we know how many elements and what those elements are
        // so we initialize array like below

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"}; // 0 ~ 11 (length-1 == last index)

        System.out.println(Arrays.toString(months));

        int number = 11;

        if(number > 12){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        System.out.println(months[number-1]);


    }

}
