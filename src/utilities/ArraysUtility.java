package utilities;

import java.util.Arrays;

public class ArraysUtility {


    // prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){

        for (int each : array) {
            System.out.println (each);
        }

    }

    // prints each double of double array in separate lines
    public static void printEachElement(double[] array){

        for (double each : array) {
            System.out.println (each);
        }

    }

    // prints each char of char array in separate lines
    public static void printEachElement(char[] array){

        for (int each : array) {
            System.out.println (each);
        }

    }

    // prints each String of String array in separate lines
    public static void printEachElement(String[] array){

        for (String each : array) {
            System.out.println (each);
        }

    }

    // returns the maximum number for integer array
    public static int max(int[] numbers){


        //sorts the array
        Arrays.sort(numbers);


        //last character of sorted array
        return numbers[numbers.length-1];
        // which is the maximum character



    }

    // returns the maximum number for double array
    public static double max(double[] numbers){


        //sorts the array
        Arrays.sort(numbers);


        //last character of sorted array
        return numbers[numbers.length-1];
        // which is the maximum character

    }

    // returns the minimum number for double array
    public static double min(double[] numbers){


        //sorts the array
        Arrays.sort(numbers);

        //returns the first character of sorted array
        return numbers[0];
        // which is the min character

    }

    // checks if the given integer is contained in the given array. returns boolean. contains(int[], int)

    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1]; // enough capacity to contain both array and element


        int i = 0; // created to access index numbers
        for (int each : array) { // because each loop can't access the access numbers

            result[i++] = each; // i: is indexes of the new array

        }
        result[i] = element; // last index is i, because it stops at the last element after each loop so we assign the element to the last index

        return result;

    }

    // adds the given element to array, returns a new array
    public  static double[] addElement(double[] array, double element){

        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public  static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public  static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }


    // finds the frequency of given element from the array
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

    // finds unique elements in the given array
    public static int[] uniqueElements(int[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        int[] result = {}; // new int[0]


        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        double[] result = {}; // new int[0]


        for (double each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        char[] result = {}; // new int[0]


        for (char each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        String[] result = {}; // new int[0]


        for (String each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    //removes the given element from the array
    public static int[] removeElements(int[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static double[] removeElements(double[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static char[] removeElements(char[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static String[] removeElements(String[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    // merge the given two arrays and returns new array
    public static int[] merge(int[] array1, int[] array2){

        int[] result = {};

        for (int each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    public static double[] merge(double[] array1, double[] array2){

        double[] result = {};

        for (double each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (double each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    public static String[] merge(String[] array1, String[] array2){

        String[] result = {};

        for (String each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (String each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    public static char[] merge(char[] array1, char[] array2){

        char[] result = {};

        for (char each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (char each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    // reverses the array, returns a new array

    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }


    public static double[] reverse(double[] array){

        double[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }


    public static String[] reverse(String[] array){

        String[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }


    public static char[] reverse(char[] array){

        char[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }

    // replaces the element of the array at given index with the new element
    public static int[] replace (int[] array, int index, int newElement ){ // at certain index



        if(index < 0 || index > array.length-1){ // invalid: less than zero or greater than last index
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement; // new element will replace the old element at the given index of array

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

    // replaces all the matching old value with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){


        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if any of the characters of array is equal to old value
                array[i] = newValue; // replace that character (index number) with the new value
            }
        }
        return array;

    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){


        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if any of the characters of array is equal to old value
                array[i] = newValue; // replace that character (index number) with the new value
            }
        }
        return array;

    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue){


        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldValue)){ // if any of the characters of array is equal to old value
                array[i] = newValue; // replace that character (index number) with the new value
            }
        }
        return array;

    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){


        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if any of the characters of array is equal to old value
                array[i] = newValue; // replace that character (index number) with the new value
            }
        }
        return array;

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





