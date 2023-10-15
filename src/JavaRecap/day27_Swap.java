package JavaRecap;

import java.util.Arrays;

public class day27_Swap {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        System.out.println(Arrays.toString(swap(array, 2, 3)));
    }

    public static int[] swap(int[] array, int i, int j){

       int temp = array[i]; // save the value that will be replaced later

        array[i] = array[j];

        array[j] = temp; // replace the given index number with the position of temp

        return array;


    }

}
/*
Swap Task:
	2.1 Create a method named swap that passes three parameters:
	 integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 */