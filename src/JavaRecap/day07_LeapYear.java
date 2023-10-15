package JavaRecap;

public class day07_LeapYear {

    public static void main(String[] args) {

        int year = 2019;

        if(year % 4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }


    }

}
/*
  2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true
 */