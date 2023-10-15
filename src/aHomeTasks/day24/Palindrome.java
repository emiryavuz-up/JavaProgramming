package aHomeTasks.day24;

public class Palindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome("Level"));

    }

    public static boolean isPalindrome (String word){


        word = word.toLowerCase();

        String reversed = Reverse.reverse(word);


        boolean isPalindrome = word.equals(reversed);

        return isPalindrome;


        }

    }

/*
 By using the reverse method above to create another method named isPalindrome
  that passes a String parameter, the method returns true if the string is palindrome,
  otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */