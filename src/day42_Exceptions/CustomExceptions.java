package day42_Exceptions;

class NoBreakException extends Exception{


}

class customException extends RuntimeException{ // to make this class RunTimeException
    // constructor class that prints string argument

    // 2 constructors are given to have 2 ways to create an object


    public customException(){
        super("Default constructor message");
    }

    public customException(String message){
        super(message); // call the parent classes constructor
    }

}
public class CustomExceptions {

    public static void main(String[] args) {

    //    throw new customException();

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }


}

