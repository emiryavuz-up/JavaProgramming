package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    private static final double piNumber = 3.14;



    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // instance, must provide implementation, only 1 implementation that would work for all the shapes
    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "\nName='" + name +
                "\nArea = " + area() + "\nPerimeter = " + perimeter();
    }

}
