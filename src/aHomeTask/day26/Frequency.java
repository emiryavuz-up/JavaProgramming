package aHomeTask.day26;

public class Frequency {


    public static void main(String[] args) {

        System.out.println(frequency("Hello"));

    }

    public static int frequency (String str){

        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(str.indexOf(eachChar) == i){ // Check if this is the first occurrence of the character

                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j)  == eachChar){
                        count++;
                    }
                }

            }


        }
        return count;

    }

}
/*
Write a Java function that takes a string and prints the frequency of each character in the string.
 */