package day31_Constructors;

public class Rectangle {

    public double length, width; // 2 instance variables

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    } // one constructor

    public double calcArea(){ // returns rectangle's area // instance method
        return  length * width;
    }

    public double calcPerimeter(){ // instance, can be called from every single object // instance method
        return 2 * (length+width);
    }

    public String toString() {
        return "Rectangle" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter();
    } // instance method to be able to print


}

/*
create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:

        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter(): calculates the perimeter of the rectangle, returns double
        toString(): displays the width, length, area and perimeter of the rectangle when an object
 */