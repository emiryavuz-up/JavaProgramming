package JavaRecap;

public class day32_Car {

    String make;
    String model;
    int year;
    double price;
    String colour;

    public day32_Car(String make) {
        this.make = make;
    }
    public day32_Car(String make, String model){
        this(make);
        this.model = model;
    }
    public day32_Car(String make, String model, int year){
        this(make, model);
        this.year = year;
    }
    public day32_Car(String make, String model, int year, double price){
        this(make, model, year);
        this.price = price;
    }
    public day32_Car(String make, String model, int year, double price, String colour){
        this(make,model,year,price);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "day32_Car{" +
                "make='" + make + '\'' +
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

		5th Constructor: intialises all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString
 */