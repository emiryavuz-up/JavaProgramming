package aHomeTask.aInterviewTask;

public class Palindrome {


    public static void main(String[] args) {
//another change is made here




        int number, summary = 0,temp;

        int jalal = 545;

        temp = jalal;

        while (jalal > 0 ){

            number = jalal % 10;
            summary = (summary * 10) + number;
            jalal = jalal / 10 ;

        }

        if (temp == summary){

            System.out.println("Palindrome");
        }
        else {

            System.out.println("Not Palindrome");
        }



        /*

       int number = 545;

        String reversed = "";

        char ch = '';

        for(int i = number.length()-1; i >= 0; i--){


            String eachCh = " " + ch ;

            reversed += eachCh;
        }

        System.out.println("is palindrome");

    }

         */
    }
}

/*
Story Title : Palindrome Program

 Story : Palindrome number in java: A palindrome number is a number that is same after reverse.
 For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
  It can also be a string like LOL, MADAM etc.

Palindrome number algorithm :

Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"

Let's see the palindrome program in java. In this java program,
 we will get a number variable and check whether number is palindrome or not.

 */