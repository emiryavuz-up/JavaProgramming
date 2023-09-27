package day48_Collections;

import java.sql.Array;
import java.util.*;

public class ListIntro {


    public static void main(String[] args) {

        // fastest performance when accessing specific element
        List <Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list1.get(0));


        // fastest performance when insertion / deletion
        List <Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list2.get(0));

        // used to achieve Thread Safety --> methods are Synchronized, Thread Safe --> it will lock the first Thread before executing 2nd Thread
        List <Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list3.get(0));

        // Child class of Vector --> methods are also Synchronized, the difference is Last-in, first out order (LIFO)
        // Stack is more unique than Vector is that the special order Stack has
        List <Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list4.get(0));

        System.out.println("-------------------------------------");

        System.out.println(list4); // output: [10, 20, 30, 40, 50]

        // last added object will be removed from the list --> LIFO
        ((Stack<Integer>) list4).pop();

        System.out.println(list4); // output: [10, 20, 30, 40]

        ((Stack<Integer>) list4).pop();

        System.out.println(list4); // output: [10, 20, 30]


    }




}
