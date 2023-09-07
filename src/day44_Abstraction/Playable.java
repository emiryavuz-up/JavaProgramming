package day44_Abstraction;


// super type of the subclasses
public interface Playable { // specifies methods for classes to use them by overriding

    // how it's done is not the issue here
    // details are meant to be left for subclasses
    // we just create the method in Playable Interface

    static boolean isFriendly = true; // it's final so we should initialize it immediately
                                     // static is gray because it's not an instance variable
                                    // this variable is a static variable, so you can re-assign it


    // test to check if variable is static
    public static void method1(){
        System.out.println("isFriendly = " + isFriendly);
    }



    void play(); // PUBLIC IS THE ONLY ACCESS MODIFIER THAT YOU CAN GIVE
                                //  ABSTRACT METHOD IS GIVEN BY DEFAULT





}
