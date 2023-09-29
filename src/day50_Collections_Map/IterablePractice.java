package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4

        // not the correct solution unlike Iterable, down below it deletes but the size changes as well
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){ // get each number first then check if it's less than 4
                list.remove(i); // that index found will be removed
            }
        }

        System.out.println(list);

        System.out.println("----------------------------------------");

        // remove all the elements that are less than 4
        // without Iterator removing properly and efficiently isn't possible
        // we call the Iterator method from Iterable --> ArrayList has IS A Relation with the Iterable
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it = list2.iterator();

        /*
        boolean r1 = it.hasNext(); // checks if there is any element and returns boolean --> we can only get the element if hasNext returns true

        System.out.println(r1);

        System.out.println(it.next()); // next method is used to get element and moves to next iteration

        boolean r2 = it.hasNext(); // checks if there is any element so that we can access

        System.out.println(it.next()); // next method is used to get the element and moves to next iteration
        */

        // all while method demands is the condition
        while (it.hasNext()){ // checks each time if there is an element we can get

           if (it.next() < 4){ // get that element and check if it's less than 4 and move to the next one
               it.remove(); // remove the element that is less than 4
           }
        }

        System.out.println(list2);

        System.out.println("--------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i = list3.iterator() ; i.hasNext() ; ){

            if(i.next() < 4){
                i.remove();
            }

        }

        System.out.println(list3);

        System.out.println("--------------------------------");

//      does all the above steps for us, it's way easier than above solutions
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list4.removeIf(each -> each < 4);
        System.out.println(list4);

    }

}
