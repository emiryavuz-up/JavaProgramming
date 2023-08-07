package aHomeTask.day20;

import java.util.Arrays;

public class Zero02 {

    public static void main(String[] args) {

        int[] number = {10, 0, 5, 0, 1, 0};

        Arrays.sort(number);



        for (int i = number.length - 1; i >= 0; i--) {
            int result = 0;
            result = number[i];
            System.out.print(result + " ");
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