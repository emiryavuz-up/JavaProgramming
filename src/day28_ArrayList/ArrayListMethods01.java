package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods01 {

    public static void main(String[] args) {

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers to the ArrayList, these numbers are autoboxed from int primitives to Integer objects
        numbers.add(10); // added at index 0
        numbers.add(20); // added at index 1
        numbers.add(30); // added at index 2
        numbers.add(40); // added at index 3
        numbers.add(50); // added at index 4
        numbers.add(60); // added at index 5

        // Insert 25 at index 2, shifting the subsequent elements to the right
        numbers.add(2, 25);
        // Insert 45 at index 5, shifting the subsequent elements to the right
        numbers.add(5, 45);

        // Print the contents of the ArrayList
        System.out.println(numbers);

        // Print the size of the ArrayList (total number of elements)
        System.out.println(numbers.size());

        // Get the index of the last element in the ArrayList
        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);

        // Retrieve the element at index 3
        numbers.get(3);

        // Store the element at index 3 in the variable num, this is unboxing as the Integer is converted to int
        int num = numbers.get(3);
        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " "); // gets each character and prints it ==> all the char of numbers
        }

        System.out.println("------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        // to replace certain word in the array list we need to call the set method

        list.set(2, "JavaScript"); // replaces the element at the given index with the new element
        System.out.println(list); // replaces the 2nd element with JavaScript
        list.set(3, "C##");
        System.out.println(list); // replaces the 3rd element with C##

    }
}