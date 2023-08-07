package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>(); // contain result: list in reversed version

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }
            result.add(each); // if it is not contained it will be added to result
        }
        System.out.println(result);

    }

}

