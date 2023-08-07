package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius; // can have different copies
    public static double pi; // only one copy
    public static String name;

    public static ArrayList<Integer> numbers = new ArrayList<>();


    public Circle(double radius) {
        this.radius = radius;
    }

    // public static Sheet sheet;

    static { // whenever you have any static variable that may take multiple steps to set it, use this block to be more efficient

        pi = 3.14; // we don't need to run this more than one time because it needs to be initialised one time only
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.addAll(Arrays.asList(10, 20, 30));

        /*
    // this way is not recommended above section is the one we should use
    // because outside this class, below information can't be used
    // this is why if you have static variable you do not use main method to set them
    // main method only runs within the class => outside the class main method can't be executed

    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(5);
        numbers.addAll(Arrays.asList(10,20,30));

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }*/

    }
}
