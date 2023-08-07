package day32_Constructor;

public class ConstructorCalls {


    // constructors will be chained together below
    public ConstructorCalls(){ // default constructor
        System.out.println("Default Constructor");
    }
    // parameter is different so constructor is overloaded
    public ConstructorCalls(int a){  // Default Constructor, Constructor with int argument

        this(); // ConstructorCalls constructor created above is called

        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

     // constructors are chained together

    public static void main(String[] args){

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("--------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("---------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
    }

}
