package aHomeTasks.day27;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        int[] insert = insert(array, 2, 100);

        System.out.println(Arrays.toString(insert));

        char[] array2 = {'s', 'b', 'b', 'e', 'f'};

        char[] insert2 = insert(array2, 2, 'X');

        System.out.println(insert2);


    }

    public static int[] insert (int[] array, int index, int element){

        array[index]= element;

        return array;
    }

    public static String[] insert (String[] array, int index, String element){

        array[index]= element;

        return array;
    }

    public static char[] insert (char[] array, int index, char element){

        array[index]= element;

        return array;
    }

    public static double[] insert (double[] array, int index, double element){

        array[index]= element;

        return array;
    }

}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element. the method inserts the given element to the given index of the array
		and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */