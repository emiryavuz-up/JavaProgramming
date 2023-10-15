package aHomeTasks.day23;

public class EvenNumbers {

    public static void main(String[] args) {

        evenNumberFinder();

    }


    public static void evenNumberFinder(){

        int numbers = 0;

        for (int i = 0; i < 100; i++) {

            if(i % 2 != 0){

                System.out.print(i + " ");
            }

        }
    }


}
