package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaac";

        String result = ""; // checks if str contains the characters when used with below conditions
              //abc

        for(int i = 0; i <= str.length()-1; i++){ // i: represents the index numbers of str starting from "0"
        String ch = "" +str.charAt(i); // represents each character of str


            // add only when result does not contain the same value
        if(!result.contains(ch)){ // if the character is not contained in the result //result in tersini ekle aynisni bulursan ekleme demek`
            result += ch; // char will be added to the result

        }


        }



    }

}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each character of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */