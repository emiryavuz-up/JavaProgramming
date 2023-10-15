package aHomeTasks.day07;

public class LeapYear {

//access modifier + "class" word" + class name + {} = THE CORRECT LINE
    // access modifier + return type + method name + paranthesis () + curly braces {}

    /*
    write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true
	                Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year

     */

    public static void main(String[] args) {

        int year = 2020;// 4e tam bolunuyorsa//ve  //esit degilse //veya
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is leap year: " + isLeapYear);

        double a = (int)21.6 % 4;
        System.out.println(a);

        double b = 58.2 / 4;
        System.out.println(b);

    }

}
