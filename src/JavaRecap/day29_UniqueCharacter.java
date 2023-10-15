package JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class day29_UniqueCharacter {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,10,20,20,30,40,40,50,50,60));

        int firstUniqueElement = 0;

        for (Integer each1 : list) {

            int frequency = 0;

            for (Integer each2 : list) {

                if(each1.equals(each2)){
                    frequency++;
                }
            }

            if(frequency == 1){
                firstUniqueElement = each1;
                break;
            }


        }

        System.out.println(firstUniqueElement);

    }

}

/*
1. Write a program that can return the first unique elements from an arraylist
 */