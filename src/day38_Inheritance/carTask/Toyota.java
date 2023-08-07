package day38_Inheritance.carTask;

public class Toyota extends Car {

    // only a constructor can call other constructor, then we can call super classes' constructor
    // it can't be directly inherited from super class because constructor name has to match with the class name

    // we don't need to set brand each time we use Toyota, so it is not given as parameter but directly set
    public Toyota(String model, String colour, int year, double price, double miles) {
        super("Toyota", model, colour, year, price, miles);
    }

    // additional method that isn't exclusive to Car => unique to Toyota
    public void reliable(){
        System.out.println(brand + ", " + model + " is a reliable car.");
    }

    // Car and Toyota has Is A Relation => Car is Super Class extended by Toyota
    //method overriding below! // depending on the object we have, we can use different implementations of the same method
    // 1 method in the heap is created with 2 different implementations
    public void start(){ // same parameter or an access modifier that is not more restrictive for example protected, private can't be used here
        System.out.println("Twist the key to ignition to start " + brand + ", " + model);
    }



}

/*
1. Toyota:
					extra methods:
							reliable()
 */