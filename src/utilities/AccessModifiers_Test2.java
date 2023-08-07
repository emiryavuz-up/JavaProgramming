package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // public is accessible both outside of package and class
//  System.out.println(AccessModifiers.defaultData); default is not accessible outside of package
//  System.out.println(AccessModifiers.privateData);  private is not accessible outside of package and class

        AccessModifiers.method1();
//      AccessModifiers.method2();  default method is not accessible outside of package
//      AccessModifiers.method3(); // private method is not accessible outside of package and class

    }
}
