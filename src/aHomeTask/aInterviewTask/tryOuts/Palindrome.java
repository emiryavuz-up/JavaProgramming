package aHomeTask.aInterviewTask.tryOuts;

public class Palindrome {

    public static void main(String[] args) {

            int number = 121;
            int originalNumber = number; // Hold the original number in a temporary variable.
            int reversedNumber = 0; // This will store the reversed number.

            // reverse the number
            while(number != 0){ // condition // if the number is 0, well there's nothing to reverse
                int digit = number%10; // this will extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // append it to our reverse number
                number /= 10; // move on to the next digit.
            }

            // compare the original number to reversed one
        if(originalNumber == reversedNumber){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }

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