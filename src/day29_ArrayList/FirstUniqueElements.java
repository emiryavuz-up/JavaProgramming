package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);


        for (Integer each : list) { // 1 // 1

            int frequency = 0; // temporary value for frequency

            for (Integer element : list) { // 1,1,1,2,3,3,4,5,5
                if (element == each) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(each);
                break;
            }

        }
    }
}
/*
warmup tasks:
	1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods

 */