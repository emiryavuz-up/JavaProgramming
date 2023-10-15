package aHomeTasks.day28;

import java.util.ArrayList;

public class MinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int minNumber = list.get(0);

        for (Integer each : list) {
            if(each < minNumber){
                minNumber = each;
            }
        }

        System.out.println(minNumber);

    }


}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */
