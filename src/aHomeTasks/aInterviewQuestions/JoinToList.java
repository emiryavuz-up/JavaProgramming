package aHomeTasks.aInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinToList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("a");

        List<String> list2 = new ArrayList<String>();

        list2.add("b");

        List<String> joinToList = new ArrayList<String>();

            joinToList.addAll(list1);

            joinToList.addAll(list2);

        System.out.println("List1 : " + list1 + "\nList2 : " + list2 + "\nJoin To List : " + joinToList);



    }
}
