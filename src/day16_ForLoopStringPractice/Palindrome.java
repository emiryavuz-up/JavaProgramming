package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {



    String word = "Racecar";

    String reversed = ""; // to compare the original result if its equal to palindrome

        for (int i = word.length()-1; i >= 0 ; i--) {
           reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed); // case sensitive "word" equals to "reversed (each char)"

        System.out.println(isPalindrome);
    /*
    "Java" ==> avaJ ==> false (not palindrome)
    "Anna" ==> "annA" ==> true (is a palindrome)
    //palindrome words:
    level
    racecar
    dad
    mom
    when you reverse you get the original!!

     */
}
}