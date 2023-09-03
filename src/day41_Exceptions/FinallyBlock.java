package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }finally{ // gets executed always, regardless of the exception being handled or not
            System.out.println("Finally Block");
        }

        // explicitly terminate the program right before finally block execution
    }

}
