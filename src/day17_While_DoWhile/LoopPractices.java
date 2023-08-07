package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        System.out.println("------------------------------------");

        int j = 1; // initialisation
        while ( j <= 10){ // fact
            System.out.println(j);
            j++; // iterator // first print j and THEN increase it, this is how you will get the next value
        }

        System.out.println("------------------------------------");

        int k = 1; // initialisation
        do{
            System.out.println(k); // statement
            k++; // first print k and then increase it, this is how you will get the next value

        }while(k <= 10); // condition is in the while loop

    }

}
