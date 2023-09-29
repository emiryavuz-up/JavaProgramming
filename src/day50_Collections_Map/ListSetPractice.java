package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        // Set does not have index number but array has
        // Use List over Array is that List has dynamic size and many methods that we can just call and use
        // So we convert Set To Array
        // Set does not have index number --> List and Array has it
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set); // set output --> [1, 2, 3, 4, 5]

        // Integer[] array = set.toArray(new Integer[0]);


        // convert set to list by using constructors of those Collections -> arraylist constructor by creating object
        List<Integer> list = new ArrayList<>( set );// gets all the methods/elements of set and adds it to the ArrayList --> contains all the elements of set

        System.out.println(list); // list output --> [1, 2, 3, 4, 5]

        List<String> names = null; // assigned null // // null pointer exception occurs when null is accessed --> object isn't created

      //  System.out.println(names.size()); // throws NullPointerException

        System.out.println("-------------------------");


        // pop() --> LIFO
        List<Character> chars = new Stack<>(); // object is created from the Stack which contains Pop method but List does not
        chars.addAll(Arrays.asList('A', 'B', 'D'));

        System.out.println("Chars before pop method: " + chars); // Chars before pop method: [A, B, D]

        // chars.pop();
        ( (Stack) chars).pop();

        System.out.println("Chars after pop method: " + chars); // Chars after pop method: [A, B]

        // poll() --> FIFO
        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Iron Man", "Wolverine", "Hulk", "Spider-man"));

        System.out.println("NameList before pop method: " + nameList);

        ((LinkedList<String>)nameList) .poll();

        System.out.println("NameList after pop method: " + nameList);




    }
}
