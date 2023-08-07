package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        
       replace(array, 2, 30);


        // to make it reusable
        array =  replace(array, 2, 30);


        System.out.println("----------------------------------");

        String[] arr2 = {"Java", "Python", "C++", "C#"};

        arr2 = replace(arr2, 2, "Ruby");

        System.out.println(Arrays.toString(arr2));



    }
    //                                 {1,2,3,4,5}, 200,        30
    public static int[] replace (int[] array, int index, int newElement ){ // at certain index 
     
        

        if(index < 0 || index > array.length-1){ // invalid: less than zero or greater than last index
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement; // new element will replace the old element at the given index
        
        return array;
     
    }

    public static double[] replace (double[] array, int index, double newElement ){ // at certain index

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement; // new element will replace the old element at the given index

        return array;

    }

    public static char[] replace (char[] array, int index, char newElement ){ // at certain index

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement; // new element will replace the old element at the given index

        return array;

    }

    public static String[] replace (String[] array, int index, String newElement ){ // at certain index

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement; // new element will replace the old element at the given index

        return array;

    }
    

}

/*
	1. Replace Task:
		1.1 Create a method named replace that passes three parameters:
		 integer array, integer index, integer newElement.
		  The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:	
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

 */