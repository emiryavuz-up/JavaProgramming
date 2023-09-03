package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword02 {

    public static void main(String[] args) {

        // throw keyword is used to manually throw exception
        // throw keyword and constructor of the class

        // Unchecked exception example
        // new keyword is used to create an object
        // Throwable is the super/parent class

        throw new NoSuchElementException("There is no such element"); // parent classes' constructor is called ...
                                                                    // which takes a String argument with exception message
                                                                    // which will be the argument : There is no such element
                                                                    // constructor with String argument

        // throw new InterruptedException(); // checked exception which requires immediate handling

        // System.out.println("Hello World"); // compiler error

        // throw new Rectangle(5,7) // Compiler error : Do not use anything if it's not throwable
        // throw is only used to create an exception
        // when you have a conditional statement if the statement does not match with the condition then you terminate the program with throw keyword
        // checked exception always causes error
        // unchecked exception does not cause error



    }

}
