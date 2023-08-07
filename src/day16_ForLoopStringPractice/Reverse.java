package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Simushy";
        //index:      0123456... 11;

        String result = ""; // contains the reversed version of str

        /*
        result += str.charAt(11);  // n
        result += str.charAt(10); // o
        result += str.charAt(9); // o
        result += str.charAt(8);// p
        result += str.charAt(7);// S
        result += str.charAt(6);// ' '
        result += str.charAt(5);// n
        result += str.charAt(4);// e
        result += str.charAt(3);// d
        result += str.charAt(2);// o
        result += str.charAt(1);// o
        result += str.charAt(0);// w
        */

        // for loop solution

        for(int i = str.length()-1; i >= 0; i--){  // initialisation should be where you want to start the loop // i want this loop to start from the last index and be repeated for 11 times to get each character
            // i: index numbers of str (starting last index to index 0)
        result += str.charAt(i); // i: represents all the characters in the input// char at is used to catch chars
    // result eventually contains the reversed version of the string therefore it's the result.


        }

        System.out.println(result);

    }

}
/*
      Write a program that can reverse a String
			Ex:
				input:
					Simushy

				output:
					noopS nedooW // data and to store this a variable is created named result

 */