package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.Animal;
import day44_Abstraction.Cat;
import day44_Abstraction.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        // upCasting Examples:
        Shape shape = (Shape) new Circle("Circle", 4);

        Shape shape2 = new Circle("Circle2", 5);

        // WebDriver driver = (ChromeDriver) new ChromeDriver();


        // downCasting Examples:
        Animal animal = new Dog("Smyrna", "Golden", 'F', 5, 'L', "Gold");

        Dog dog2 = new Dog("Maya", "Poodle", 'F', 5, 'S', "Apricot");

        Dog dog = (Dog) animal; // downCasting // can be used more than once and is reusable

        ( (Dog) animal ).bark(); // downCasting // this can be used once and isn't reusable

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        dog.bark();
        dog.play();
        dog2.bark();

        Shape shape1 = new Square(5);

        System.out.println( ( (Square) shape1).getSide());

        System.out.println("----------------------------------------");

        Animal animal2 = new Cat("Limon", "Stray", 'M', 5, 'S', "Gray");

        // if you are going to use it more than once, assign it to a variable first
        Cat cat = (Cat) animal2;

        // if you need to use it once, you do not need a variable
        ( (Cat) animal2).meow();

       // ( (Dog) animal2 ).bark(); // you can't cast Cat to Dog because there is NOT IS A RELATION between them

        cat.scratch();
        cat.meow();

        Employee employee = new Tester("Tester", 30, 'F', 515, "SDET", 500000);

        // first cast it, then place in a parenthesis before using .methodName
        ( (Tester)employee ).bugReport();

       // ( (Developer)employee ).unitTest();

        // employee variable is a TESTER Object
        // Driver driver = (Driver) employee; // line 1
        Person person = (Person) employee; // line 2
        // Teacher teacher = (Teacher) employee; // line 3

        System.out.println("------------------------------------------");

        Shape s1 = new Circle("Circle", 50);

        s1.area();
        s1.perimeter();

       // ( (Cube)s1 ).volume(); // Cube does not have IS A RELATIONSHIP with the Circle therefore ClassCastException will be thrown





    }

}
