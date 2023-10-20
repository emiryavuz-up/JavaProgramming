package JavaRecap;

import java.util.*;

public class day48_49_Collections {

    public static void main(String[] args) {

        // fastest performance when accessing specific element
        List<Integer> list1 = new ArrayList<>();
        List<Integer> duplicatedNumbers = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,30,40,50,50,60,70,70));


        for (Integer each1 : list1) {

            int frequency = 0;

            for (Integer each2 : list1) {

                if(each1.equals(each2)){
                    frequency++;
                }
            }

            if(duplicatedNumbers.contains(each1)){
                continue;
            }

            if(frequency > 1){
                duplicatedNumbers.add(each1);
            }

        }
        System.out.println(duplicatedNumbers);

        System.out.println("------------------------------------");

        // fastest performance when insertion / deletion
        List <String> list2 = new LinkedList<>();
        list2.add(("level"));

        String reversed = "";

        for (String each : list2) {

            for (int i = each.length()- 1; i >= 0; i--) {


                reversed += each.charAt(i);
            }

            System.out.println(reversed.equalsIgnoreCase(each)? "input is palindrome" : "input isn't palindrome");

        }


        // used to achieve Thread Safety --> methods are Synchronized, Thread Safe --> it will lock the first Thread before executing 2nd Thread
        List <Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50));


        // Child class of Vector --> methods are also Synchronized, the difference is Last-in, first out order (LIFO)
        // Stack is more unique than Vector is that the special order Stack has
        List <Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50));




    }
}
