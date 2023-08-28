package day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "CodeBastards"; // default // can't be accessed outside the package

    protected static String name2 = "Java Programming"; // protected

    // static(default) variable can be inherited only to the classes that are in the same package

    // if the class is subclass => protected static variable can be inherited by other classes in the other packages

    static void method1(){

    }

    protected static void method2(){

    }


}
