package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 80, 90};
        int min = numbers[0]; // assuming first is the min number to compare with others with loops
                            // when there is a smaller number, we will assign it to this int min

        for (int i = 0; i < numbers.length; i++) {
         if(numbers[i] < min){ // check if there is an element in the array that's smaller
             min = numbers[i]; // assign that number to the min
         }
        }


        System.out.println(min);
    }

}
