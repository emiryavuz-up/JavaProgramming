package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        // does not keep the order so it's faster
        Set<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(10,20,30,40,50));
        set1.addAll(Arrays.asList(10,20,30,40,50)); // will be removed since it contains and this is Set
        set1.addAll(Arrays.asList(10,20,30,40,50)); // will be removed since it contains and this is Set
        set1.addAll(Arrays.asList(10,20,30,40,50)); // will be removed since it contains and this is Set

        System.out.println(set1); // [50, 20, 40, 10, 30]

        System.out.println("------------------------------------");

        // keeps the order
        Set<Integer> set2 = new LinkedHashSet<>();

        set2.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(set2); // [10, 20, 30, 40, 50]

        System.out.println("------------------------------------");

        // keeps the order
        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10,20,30,40,50)); // [10, 20, 30, 40, 50]

        System.out.println(set3);





    }


}
