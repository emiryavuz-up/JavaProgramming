package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8)); // convert of array of values to a Collection Type with asList method from ArraysUtility class
                        // asList method accepts array of values and at the end they are converted to a Collection Type

        System.out.println("List: " + list);

        list.removeAll(Arrays.asList(3,5,8)); // removeAll method removes the specified indexes converted by asList method

        System.out.println("RemoveAll asList Numbers: " + list);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300, 800, 900));

        numbers.retainAll(Arrays.asList(100, 200, 300)); // retainAll keeps the specified numbers converted by asList
                                                        // opposite function of removeAll

        System.out.println("Retain asList Numbers: " + numbers);

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println("Job Titles = " + jobTitles);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10); // true
        System.out.println("r1 = " + r1);

        boolean r2 = nums.containsAll(Arrays.asList(2,5,10)); // true
        System.out.println("r2 = " + r2);

        boolean r3 = nums.containsAll(Arrays.asList(3,6,11)); // false because of 11
        System.out.println("r3 = " + r3); // allows you to convert array of values to a list
        // if you want to add or remove from an array you need to use collection type one of them is asList
        // array is immutable
        
        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
        
        ArrayList<String> namesList = new ArrayList<>();
        
        
        namesList.addAll(Arrays.asList(names)); // bulk operation takes collection type as value
                                                // non-primitive Arrays converted to an arrayList
        
        ArrayList<String> namesList2 = new ArrayList<>(Arrays.asList(names));

        System.out.println("namesList = " + namesList);

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10}; // Integer because int (non primitive) can't be converted to asList

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list2 = " + list2);

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));



        

    }


    // This is a static method that takes an array of integers as input
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        // We create a new ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // For each element in the input array
        for (int each : array) {
            // Add the current element to the ArrayList
            list.add(each);
        }

        // At the end of the method, return the ArrayList that we have built
        return list;
    }


}
