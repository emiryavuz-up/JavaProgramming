package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.sum;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("-----------------------------");

        System.out.println(sum(10, 20));

        int r1 = sum(100,200);
        System.out.println(r1);

        int r2 = subtract(82731,137);
        System.out.println(r2);

        int r3 = max(1000,2000);
        System.out.println(r3);

    }

}
