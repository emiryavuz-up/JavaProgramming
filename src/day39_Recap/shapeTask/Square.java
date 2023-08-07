package day39_Recap.shapeTask;

public class Square extends Shape {

    // first give methods and variables that can not be inherited

    // adding additional variable which will be used by Square

    // to make the data readable and changeable -> we use getter and setter

    private double side; // return type must be same with this variable // to have control over the data = to check if the given side is valid through setter

    public double getSide() {
        return side;
    }

    public void setSide(double side){
        if(side <= 0){
            System.err.println("Invalid Side: " + side);
            System.exit(1); // something went wrong
        }
        this.side = side;
    }

    // subclass has to call this constructor of superclasses constructor
    // we already know the name for this class, which will be the same for all objects, so we set it directly
    public Square(double side) { // parameter is given because we need a new data to be given to be set as side
        super("Square");
        setSide(side); // it will be assigned with conditions set in the setSide method
    }

    @Override
    public double area() {
        return side * side; // formula to calculate area
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override // when it comes to toString of the Square, we have to make a modification which can be done by Overriding
    public String toString() {
        return "Square\n" +
                " side =\t" + side +
                " area =\t'" + area() + '\'' +
                " perimeter =\t'" + perimeter() + '\'';
    }
}

/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the field

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
