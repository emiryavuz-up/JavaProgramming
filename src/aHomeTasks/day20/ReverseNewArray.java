package aHomeTasks.day20;

public class ReverseNewArray {

    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    int[] reversedArray = new int [numbers.length];

    int j = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[j] = numbers[i];
            j++;
        }

        for (int number : reversedArray) {
            System.out.print(number + " ");
        }

    }

}
/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */