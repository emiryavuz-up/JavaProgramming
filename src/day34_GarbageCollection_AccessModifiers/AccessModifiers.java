package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100; // public access modifier

    static int defaultData = 200; // default access modifier also known as "no access modifier"

    private static int privateData = 300; // private access modifier


    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }


    public static void main(String[] args) {

        // all of those access modifiers are reachable within the same class

        // out-side of the class within the same package public and default is visible but private is not

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }




}
