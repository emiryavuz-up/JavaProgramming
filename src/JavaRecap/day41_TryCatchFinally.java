package JavaRecap;

import JavaRecap.day37_EmployeeTask.Person;

public class day41_TryCatchFinally {

    public static void main(String[] args) {

        Person person = null;

        try{
            person.getGender();
        }catch (ArithmeticException a) {
            System.out.println("Arithmetic Exception is caught.");
            a.printStackTrace();
        }catch (IndexOutOfBoundsException i) {
            System.out.println("Index Out Of Bound Exception is caught");
            i.printStackTrace();
        }catch (NullPointerException n){
            System.out.println("Null Pointer Exception is caught");
            n.printStackTrace();
        }finally {
            System.out.println("This will be executed regardless of the try catch method");
        }


    }

}
