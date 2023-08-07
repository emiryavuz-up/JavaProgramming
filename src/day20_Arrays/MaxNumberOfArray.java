package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; //
        
        // assume that 1st number is the max, compare it with the rest, if there is one that is greater i need to replace it
        
        // first get every single element of the numbers array, for this we will use loop

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){ // if there is element in the array that is greater than current max nr.
                max = numbers[i]; // assigning greater number to max number under if condition
            }
        }
        
        // 10 greater to 10? no, 5 greater than current max number which is 10? no, 4 greater than 10? no
        // 20 greater than 10 yes, if so, get that number and assign it to max number.

        System.out.println(max); // after iterating and loop, we print the max number
        
        }
        
    }


