package aHomeTasks.day23;

public class OddNumbers {

    public static void main(String[] args) {

            oddNumberFinder();

    }


    public static void oddNumberFinder(){

        int numbers = 0;

        for (int i = 0; i < 100; i++) {

           if(i % 2 == 0){

               System.out.print(i + " ");
           }

        }
    }


}


/*
	1. create a method that can print odd numbers between 1~100 in a same line separated by space
 */