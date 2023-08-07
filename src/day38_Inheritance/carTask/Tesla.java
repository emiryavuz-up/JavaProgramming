package day38_Inheritance.carTask;

public class Tesla extends Car {


    public Tesla(String model, String colour, int year, double price, double miles) {
        super("Tesla", model, colour, year, price, miles);
    }

    // additional method that isn't exclusive to Car => unique to Tesla
    public void autoPilot(){
        System.out.println(model + ", " + brand + " is on Auto-pilot.");
    }

    // Car and Tesla has Is A Relation => Car is Super Class extended by Tesla
    //method overriding below! // depending on the object we have, we can use different implementations of the same method
    // 1 method in the heap is created with 2 different implementations
    public void start(){ // same parameter or an access modifier that is not more restrictive for example protected, private can't be used here
        System.out.println("Say \"Start\" to start " + brand + ", " + model);
    }

}
/*
Tesla:
					extra methods:
						autoPilot();

 */