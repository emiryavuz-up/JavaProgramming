package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default
    static final int b = 200; // static & final by default

    /*
    public PropertiesOfInterface(int a){
        this.a = a;
    }

     */

    /*
    static{
        b = 100;
    }

 */

    /*
    public void method1(){
        System.out.println("Instance method");
    }

     */

    public static void method2(){ // you don't have to call the object, this method can be used through class name
        System.out.println("Static method");
    }

    void method3();



    // default method example to be inherited as it is
    public default void method4(){
        System.out.println("Default method"); // all animals drink water, so we can print that in the body
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        new Test().method4();
    }


}