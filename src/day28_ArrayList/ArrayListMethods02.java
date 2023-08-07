package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        int num = 1;
        list.remove(num); // primitive int will be taken as an index number so 200 at index one will be removed
        System.out.println(list);

        Integer num2 = 400; // non primitive
        list.remove(num2); // element itself will be removed from the array list
        System.out.println(list);

        Integer num3 = 700;
        boolean r1 = list.remove(num3);
        System.out.println(r1);

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('A');

        characters.indexOf('A'); // 0
        characters.indexOf('B'); // 1
        int num4 = characters.lastIndexOf('A'); // 4 // returns int so result is re-assigned to int num4

        System.out.println(num4);

        System.out.println("---------------------------");

        ArrayList<Character> characters1 = new ArrayList<>();

        characters1.add('A');
        characters1.add('A');
        characters1.add('A');
        characters1.add('A');
        characters1.add('A');

        int a = characters1.indexOf('A'); // 0
        int b = characters1.lastIndexOf('A'); // 4

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------");

        boolean r2 = characters1.contains('A');
        boolean r3 = characters1.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // two different objects, therefore it prints false
        System.out.println(list.equals(list2)); // two array list compared, therefore it is true // same elements

        System.out.println("----------------------------------------");

        boolean r4 = list1.isEmpty();
        System.out.println(r4); // false because it contains elements

        list1.clear(); // deletes the elements in the list1
        boolean r5 = list1.isEmpty(); // true because elements are deleted in the previous method
        System.out.println(r5);

        System.out.println("----------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4));

        System.out.println(numbers);

    }


}
