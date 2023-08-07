package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] array = {1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};

        int n = frequencyOfElement(array, 1);

        System.out.println(n);

    }
                                        // [1,1,1,2,3,4,5]    1
    public static int frequencyOfElement(int[] array, int elemenet){
        // get every single element of array and compare with element that is given
        // create another variable to count how many times element matches with the numbers in the array

        int count = 0;

        for (int each : array) { // each represent each character of array
           if(each == elemenet){ // each time element matches each character of array
               count++; // increase count by 1
           }

        }
return count; // show me how many times above conditions happened

    }

    public static int frequencyOfElement(double[] array, double elemenet){
        // get every single element of array and compare with element that is given
        // create another variable to count how many times element matches with the numbers in the array

        int count = 0;

        for (double each : array) { // each represent each character of array
            if(each == elemenet){ // each time element matches each character of array
                count++; // increase count by 1
            }

        }
        return count; // show me how many times above conditions happened

    }

    public static int frequencyOfElement(char[] array, char elemenet){
        // get every single element of array and compare with element that is given
        // create another variable to count how many times element matches with the numbers in the array

        int count = 0;

        for (char each : array) { // each represent each character of array
            if(each == elemenet){ // each time element matches each character of array
                count++; // increase count by 1
            }

        }
        return count; // show me how many times above conditions happened

    }

    public static int frequencyOfElement(String[] array, String elemenet){
        // get every single element of array and compare with element that is given
        // create another variable to count how many times element matches with the numbers in the array

        int count = 0;

        for (String each : array) { // each represent each character of array
            if(each.equals(elemenet)){ // each time element matches each character of array
                count++; // increase count by 1
            }

        }
        return count; // show me how many times above conditions happened

    }

}
/*
Create a class namedFrequencyOfElement
Create a method that passes two parameters: an integer array and an Integer element. method returns the frequency of the element
 */