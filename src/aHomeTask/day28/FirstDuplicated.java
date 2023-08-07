package aHomeTask.day28;

import java.util.ArrayList;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(list.contains(each)){
                result.add(each);
                break;
            }

        }

        System.out.println(result);



    }


}
/*
Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */