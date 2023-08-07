package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // auto-boxing
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // Iterate over each element of the list

            list.set(i, list.get(i) * 2);   // Get the current element, double it, and then set it back to the list at the same position
        }
        System.out.println("list = " + list);

        System.out.println("---------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0); // element at index number 0 will be removed from employees ArrayList // decreases value by 1

        System.out.println(employees);

        employees.remove(0); // element at index number 0 will be removed from employees ArrayList // decreases value by 1

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        boolean r1 = employees.remove("Olga");

        boolean r2 = employees.remove("Ali");

        boolean r3 = employees.remove("Hulya");

        boolean r4 = employees.remove("Smyrna");

        System.out.println(employees);

        System.out.println("Is Ali Removed? " + r2);
        System.out.println("Is Smyrna Removed? " + r4);




    }
}
/*
{1,2,3,4,5,6}
each character multiplied by 2
get method to get every single element
set method for replace function
reach each of the indexes so use regular loop "fori"
{2,4,6,8,10,12}
 */