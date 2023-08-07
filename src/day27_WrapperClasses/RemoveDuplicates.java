package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

            words = removeDuplicates(words);

            System.out.println(Arrays.toString(words));


        int[] numbers = {1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};

        numbers = Arrays.stream(numbers).distinct().toArray();

        System.out.println(Arrays.toString(numbers));


        }


        //removes the duplicates from the given array, returns the new array
        public static int[] removeDuplicates(int[] array){


            int[] result = {}; // {1

            for (int each : array) {
                if( !ArraysUtility.contains(result, each)){ // if 1 is not equal (first index number)
                     result = ArraysUtility.addElement(result, each); // we add that element to result

                }

            }
                return result;
        }

        public static double[] removeDuplicates(double[] array){


        double[] result = {}; // {1

        for (double each : array) {
            if( !ArraysUtility.contains(result, each)){ // if 1 is not equal (first index number)
                result = ArraysUtility.addElement(result, each); // we add that element to result

            }

        }
        return result;
    }

        public static String[] removeDuplicates(String[] array){


        String[] result = {}; // {1

        for (String each : array) {
            if( !ArraysUtility.contains(result, each)){ // if 1 is not equal (first index number)
                result = ArraysUtility.addElement(result, each); // we add that element to result

            }

        }
        return result;
    }

        public static char[] removeDuplicates(char[] array){


        char[] result = {}; // {1

        for (char each : array) {
            if( !ArraysUtility.contains(result, each)){ // if 1 is not equal (first index number)
                result = ArraysUtility.addElement(result, each); // we add that element to result

            }

        }
        return result;
    }




    }


