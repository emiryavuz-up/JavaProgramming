package aHomeTask.day20;

import java.util.Arrays;

public class Zero {

    public static void main(String[] args) {

       int [] numbers = {10, 0, 5, 0, 1, 0};

       int eachNr = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0){
                eachNr = i;
                eachNr++;
            }

            if(numbers[i] == 0){

            }


        }

    }

}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */
