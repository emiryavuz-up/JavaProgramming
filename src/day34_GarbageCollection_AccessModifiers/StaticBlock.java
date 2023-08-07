package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method");
    }


    static{ // runs first before anything, and only runs one time == does not have a name, so you can not call it, it gets executed as soon as the class is loaded you do not call it
        System.out.println("Static Block 1");
    }

    static{ // does not have a name, so you can not call it, it gets executed as soon as the class is loaded you do not call it
        System.out.println("Static Block 2");
    }

    static{ // runs first before anything, and only runs one time
        System.out.println("Static Block 3");
    }


}
