package JavaRecap.day44_CarTask;

import java.util.Collection;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    double price;
    String colour;

    public Car(String make, String model, int year, double price, String colour) {
        if(make.isEmpty()){
            System.err.println("Make can't be empty/null.");
            throw new RuntimeException();
        }
        this.make = make;
        if(model == null){
            System.err.println("Model can't be null/empty.");
            throw new RuntimeException();
        }
        this.model = model;
        if(year < 0){
            System.err.println("Year can't be negative.");
            throw new RuntimeException();
        }
        this.year = year;
        setPrice(price);
        setColour(colour);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 10){
            System.err.println("Price can't be less than $10");
            throw new RuntimeException();
        }
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if(colour.isEmpty()){
            System.err.println("Colour can't be empty.");
            throw new RuntimeException();
        }
        this.colour = colour;
    }

    abstract void start();
    abstract void drive();

    public void stop(){
        System.out.println(getColour() + " " + getModel() + " has stopped.");
    }

    @Override
    public String toString() {
        return "Car" +
                "\nMake = " + make   +
                "\nModel = " + model +
                "\nYear = " + year   +
                "\nPrice = $" + price +
                "\nColour = " + colour;
    }
}


/*
Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */