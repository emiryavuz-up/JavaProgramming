package aHomeTask.day10;

public class BiggerNum {

    public static void main(String[] args) {

        /*
        BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */

        int n1 = 5;
        int n2 = 6;
        int n3 = 7;
        String result = "";

        if(n1 >= n2 && n1 >= n3){
            result = "n1 is bigger";
        }else if (n2 >= n1 && n2 >= n3){
            result = "n2 is bigger";
        }else {
            result = "n3 is bigger";
        }

        System.out.println(result);

    }


}
