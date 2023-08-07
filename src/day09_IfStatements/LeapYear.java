package day09_IfStatements;

public class LeapYear {


    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = 2000 % 4 == 0;
        boolean notLeapYear = !leapYear;

        if(leapYear){
            System.out.println("Year " + year + " is a Leap Year");
        }else{
            System.out.println("Year " + year + " is NOT a Leap Year");
        }

    }


}
