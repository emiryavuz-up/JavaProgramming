package JavaRecap;

import java.util.*;

public class day30_Swap {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        Collections.swap(list, 0,1);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0,0,0,10,20,30,40,50));

        Collections.sort(list2);




    }

}
/*
warmup tasks:
	1. Write a program that can swap the first and last elements of an ArrayList

	2. Write a program that can move all the zeros to the last indexes of ArrayList

Ex:

List:
	{1,0,2,0,3,0,4,0}

Output:

	[1,2,3,4,0,0,0,0]
 */
