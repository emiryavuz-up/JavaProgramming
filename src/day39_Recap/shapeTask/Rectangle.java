package day39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double length, width;

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        if(length <= 0){
            System.err.println("Invalid Length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public void setWidth(double width){
        if(width <= 0){
            System.err.println("Invalid Length: " + length);
            System.exit(1);
        }
        this.width = width;
    }

    // we already know the name, so we set directly to be more efficient when using it
    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * ( length + width ) ;
    }

    @Override
    public String toString() {
        return "Rectangle\n" +
                " area =\t'" + area() + '\'' +
                " perimeter =\t'" + perimeter() + '\'' +
                " length =\t" + length +
                " width =\t" + width;
    }
}

/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the field

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */