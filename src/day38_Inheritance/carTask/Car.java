package day38_Inheritance.carTask;

public class Car { // super class // commmon features of all the sub-classes will be set here to be used later on in them

    public String brand, model, colour;
    public int year;
    public double price, miles;

    public Car(String brand, String model, String colour, int year, double price, double miles){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }




    public void start(){
        System.out.println(brand + ", " + model + " has started.");
    }
    public void drive(){
        System.out.println(brand + ", " + model + " is driving.");
    }
    public String toString(){
        return
        "Brand:\t" + brand + "\nModel:\t" + model + "\nColour:\t" + colour +
                "\nYear:\t" + year + "\nPrice:\t" + price + "\nMiles:\t" + miles;
    }

}

/*
	instance variables:
				brand, model, year, price, colour, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

 */