package day41_Exceptions;

import day35_Encapsulation.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {


        Employee employee = null;

        try { // the fish
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){ // first person tries to catch the fish
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){ // second person tries to catch the fish
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ // third person tries to catch the fish
            System.out.println("Third catch block");
            e.printStackTrace();
        }
        // if the fish is never caught, the program will be terminated and the exit code will be 1 because exception is still there

    }

}
