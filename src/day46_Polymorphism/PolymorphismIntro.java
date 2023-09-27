package day46_Polymorphism;

import day39_Recap.personTask.*;
import day39_Recap.shapeTask.Circle;
import day40_FinalKeyword.Animal;
import day40_FinalKeyword.Dog;
import day43_Abstraction.car.Car;
import day43_Abstraction.employeeTask.Driver;
import day44_Abstraction.Cat;
import day44_Abstraction.Playable;
import day45_Abstraction.shape.Rectangle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;
import day45_Abstraction.shape.Triangle;


import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

    String str = "Wizard Wand";

    Integer n1 = 2;

    Double n2 = 5.5;

    Boolean r1 = true;

    // all the data above will be accepted in the Object
    // Object is a generic name, it could be String, Integer, Double, boolean etc...
    Object[] array = {str, n1, n2, r1, new Circle(4124)};


        Developer developer = new Developer("Smyrna", 3, 'F', 239523, " Java Developer", 600000);
        developer.fixingBugs();

        Employee tester = new Tester("Maya", 6, 'F', 23525, "Senior QA Engineer", 550000);
        tester.work();

        Employee teacher = new Teacher("Jager", 3, 'M', 41985,"Teacher", 350000);
        teacher.work();

        Person student = new Student("Leika", 1, 'F', 1230, "IT");
        student.sleep();

        Employee employee = new Employee("Aksel", 5, 'M', 12355, "Employee", 500000);
        employee.work();

        ArrayList<Person> companyEmployees = new ArrayList<>();


        companyEmployees.add(tester);
        companyEmployees.add(developer);
        companyEmployees.add(teacher);
        companyEmployees.add(student);
        companyEmployees.add(employee);

        for (Object eachObj : companyEmployees.toArray()) {
            System.out.println(eachObj);
            System.out.println("--------------------------");
        }


        Animal animal = new Dog("Smyrna", "Golden", 'F', "Gold", "Big", 5);

        animal.drink();
        animal.eat();
      //  animal.play();
      //  animal.bark();

        Playable animal2 = new Cat("Smyrna", "Golden", 'F', 5, 'S', "Gray");

        animal2.play();

        Playable animal3 = new day44_Abstraction.Dog("Smyrna", "Golden", 'F', 5, 'L', "Gold");

        animal3.play();


        System.out.println("---------------------------");

        Shape shape = new Triangle("Triangle");
        shape.area();

        boolean isTriangle = shape instanceof Triangle;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isSquare = shape instanceof Square;

        System.out.println("Is triangle: " + isTriangle);

        System.out.println("Is rectangle: " + isRectangle);

        System.out.println("Is square: " + isSquare);

        /*
        WebDriver driver:

        if(driver instance of ChromeDriver{
        System.out.println("Chrome will open"){
        else(driver instance of SafariDriver{
         System.out.println("Safari will open");
         }}
         */


    }

}

/*
    ChromeDriver driver;

    driver = new ChromeDriver();
    driver = new FireFoxDriver();

 */