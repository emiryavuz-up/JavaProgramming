package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        // NOTICE PARANTHESIS IS OPTIONAL IN TERNARIES. BUT TO MAKE IT READABLE, DO IT LIKE THIS

        int number = 5;

        String nameOfTheMonth = number == 1? "January" :(number == 2)? "February" :(number == 3)? "March"
                :  (number == 4)? "April" :  (number == 5)? "May" :  (number == 6)? "June"
                : (number == 7)? "July" : (number == 8)? "August"
                : (number == 9)? "September" : (number == 10)? "October"
                : (number == 11)? "November" : "December";

        // if you have 10 question marks you should also have 10 columns for the ternaries

        System.out.println("nameOfTheMonth = " + nameOfTheMonth);
    }
}
