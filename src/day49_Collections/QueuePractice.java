package day49_Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,20,300,40,90));

        System.out.println("Priority Queue: " + priorityQueue); // order will be random


        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,20,300,40,90));

        System.out.println("Linked List: " + linkedList);  // order is the same as it's added [10, 20, 300, 40, 90]

        System.out.println("----------------------------");

        priorityQueue.poll(); // [10, 20, 300, 40, 90]

        System.out.println("Priority Queue: " + priorityQueue); // first inserted element is removed

        priorityQueue.poll(); // [20, 40, 300, 90]

        System.out.println("Priority Queue: " + priorityQueue); // second inserted element is removed



    }


}
