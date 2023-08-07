package day39_Recap.shapeTask;

public class Circle extends Shape { // if this is a sub class
    // before giving the extends keyword
    // add the additional fields and methods first

    private double radius;
    private static double pi = 3.14; // static value which won't be changed => same for all objects

    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    // we don't need to give a name everytime we use the object because it's the same so we set directly
    public Circle(double radius) {
        super("Circle");
        setRadius(radius); // conditionally set // helps to check if the radius is valid or not if not it will display error message
        // if it is valid it willset the radius of the circle
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override // overridden because we need to include radius as well
    public String toString() {
        return "Circle\n" +
                " radius =\t" + radius +
                " pi =\t" + pi +
                " area =\t'" + area() + '\'' +
                " perimeter =\t'" + perimeter() + '\''
                ;
    }


}
