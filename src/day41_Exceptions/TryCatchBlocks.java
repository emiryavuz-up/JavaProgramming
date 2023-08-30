package day41_Exceptions;

import javax.naming.PartialResultException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try{

            System.out.println(9/0); // is an exception

            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception has been detected");

        }

        System.out.println("Test1 Completed");

        System.out.println("-----------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try { // try block

            System.out.println(numbers[200]); // exception code can be put in the try block

            System.out.println("Try Block");

        }catch (RuntimeException e){ // catch block catches it then the codes under will be executed
            // ArrayIndexOutOfBoundsException should exist in the try block
            // if you don't know the exception class which must be unchecked
            // parent of all unchecked exception classes can be used instead of the specific exception class name
            // because parent can handle subclasses ==> let the parent handle it if you don't know which exception it is
            // ultimate solution is to use RuntimeException as it's the parent of all unchecked exceptions

          // e.printStackTrace(); // prints all the details of the exception

          // System.out.println(e.getMessage()); // must be placed in the catch block

            System.out.println("Catch Block\t: Runtime Exception has been detected");
        }


        System.out.println("Test2 Completed");


        System.out.println("------------------------------------------------------------");

        System.out.println("Test3 Started");


        try{
            System.out.println("CodeBastards".substring(2,0)); // unchecked exception because compiler does not check it, and we don't know which exception is it
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 Completed");

        System.out.println("------------------------------------------------");

        System.out.println("Hello");
        try {
            Thread.sleep(3000); // pause the execution for 3 seconds
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("CodeBastards");

        System.out.println("-------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
