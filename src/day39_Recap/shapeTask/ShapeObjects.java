package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        square.setSide(10);

        System.out.println(square);

        System.out.println("------------------");

        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle);

        rectangle.setWidth(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        Circle circle = new Circle(5);

        System.out.println(circle);

        circle.setRadius(5);

        System.out.println(circle.getName());

    }

}
