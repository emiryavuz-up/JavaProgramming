package day32_Constructor;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String colour;

    public Car(String brand){ // string argument
        this.brand = brand; // that will help us set the brand
    }

    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price){
        this(brand,model,year);
        this.price = price;
    }
    public Car(String brand, String model, int year, double price, String colour){
        this(brand,model,year);
        this.colour = colour;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

}

/*
class name: Car
		 instance variables:
		 		make, model, year, price, colour

 		1st constructor: initialises the make ONLY

 		2nd constructor: initialises make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initialises make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initialises make, model, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: initialises all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString


 */