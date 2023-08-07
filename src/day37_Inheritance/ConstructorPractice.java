package day37_Inheritance;

// just show what happens when constructor called in the sub-class => all the classes will be created here

class A{
    public A(int a){ // if the constructor passing parameter it is a mandatory step for sub class to call it
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super(9); // SUPER CLASSES' CONSTRUCTOR CALL OCCURED IN THE FIRST PLACE MANUALLY => because it is not default
        // but if it is default you have to do it manually by yourself => if the super class does not pass any parameter
        //first step, this sub-class calls the parent-classes' constructor
        //super() => mandatory step for child class => it has to call the parent class' constructor
        // => if not created, compiler automatically calls it (implicitly)
        System.out.println("B");
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B(); // prints => A B

    }

}
