package day38_Inheritance.carTask;

public class BMW extends Car{

    // we don't need to set brand each time we use BMW, so it is not given as parameter but directly set
    public BMW(String model, String colour, int year, double price, double miles) {
        super("BMW", model, colour, year, price, miles);
    }

    // additional method that isn't exclusive to Car => unique to BMW
    public void racing(){
        System.out.println(model + ", " + brand + " is racing.");
    }

    // additional method that isn't exclusive to Car => unique to BMW
    public void breaksDown(){
        System.out.println(brand + ", " + brand + " has broken down.");
    }

    // Car and BMW has Is A Relation => Car is Super Class extended by BMW
    //method overriding below! // depending on the object we have, we can use different implementations of the same method
    // 1 method in the heap is created with 2 different implementations
    public void start(){ // same parameter or an access modifier that is not more restrictive for example protected, private can't be used here
        System.out.println("Call Mechanic and Jump Start to start " + brand + ", " + model);
    }



}
/*
BMW
		extra methods:
						breaksDown()
						racing()
 */