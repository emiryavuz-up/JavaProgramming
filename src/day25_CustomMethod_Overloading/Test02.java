package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test02 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

      ArraysUtility.printEachElement(arr1);

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

      ArraysUtility.printEachElement(arr2);

        char[] arr3 = {'a', 'b', 'c', 'd'};

      ArraysUtility.printEachElement(arr3);

        String[] arr4 = {"Aaaa", "BBbb", "bkdg"};

      ArraysUtility.printEachElement(arr4);

        System.out.println("------------");

        int[] n1 = {1,2,3,4,5};

        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};

        double max2 = ArraysUtility.max(n2);

        System.out.println(max2);

        double[] n3 = {1.2, 6.8, 13,2, 3.2};

        double min = ArraysUtility.min(n3);

        System.out.println(min);

        int[] array = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(array, 5);

        System.out.println(r1);

    }

}
