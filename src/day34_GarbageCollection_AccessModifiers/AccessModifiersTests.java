package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTests {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // we can access output is 100 = public can be used anywhere

        System.out.println(AccessModifiers.defaultData); // we can access output is 200 = same package is enough for default to be visible

       // System.out.println(AccessModifiers.privateData); // can not be accessed because it's private and therefore isn't visible outside the class

        AccessModifiers.method1(); // public can be used everywhere therefore can be called
        AccessModifiers.method2(); // default can be used within the same package therefore can be called
    //  AccessModifiers.method3(); will give you compiler error because it is private


    }

}

class D{

}
// public can not be given because you can not have 2 public classes in one file
// and your public class name has to match with the file name
// so one class must have public but the others should be default