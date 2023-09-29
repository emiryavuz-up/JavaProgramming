package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice02 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jimmy", "Johnny", "Johnny", "Dennis", "dennis", "Jonny", "Jenny"));

        // remove all the names "dennis"
        // remove element has to be done by using Iterable -> otherwise previous index will represent another number it will keep changing therefore in the loop it will cause problem when removing

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("dennis")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("----------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Jimmy", "Johnny", "Johnny", "Dennis", "dennis", "Jonny", "Jenny"));

        for(Iterator<String> i = names2.iterator(); i.hasNext();){
            if(i.next().equalsIgnoreCase("dennis")){
                i.remove();
            }
        }
        System.out.println(names2);

        System.out.println("----------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Jimmy", "Johnny", "Johnny", "Dennis", "dennis", "Jonny", "Jenny"));

        names3.removeIf(each -> each.equalsIgnoreCase("dennis")); // element --> arrow token --> condition

        System.out.println(names3);

        List<String> names4 = new ArrayList<>();
        names4.addAll(Arrays.asList("Jimmy", "Johnny", "Johnny", "Dennis", "dennis", "Jonny", "Jenny"));



    }

}
