package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car; // custom class imported

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        String str = null;

        System.out.println(str.toUpperCase());
*/

        String str = "Simushy";
        str = null;

        System.out.println( str ); // null as output

        Car car1 = new Car("Toyota"); // custom object is called
        // to make the eligible for garbage collection is first assigning null to it

        car1 = null;

        System.out.println(car1);

        Dog dog1 = new Dog();

        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language = "Java";

        System.out.println(language);

        //after line 38 language will be Java
        // which means Python is eligible for Garbage Collection, so Python will be deleted because it is unreferenced

        System.out.println("------------");

        ArrayList<Integer> list1 = new ArrayList<>(); // first door of the room

        list1.add(100);

        ArrayList<Integer> list2 = list1; // second door of the room

        list2.addAll(Arrays.asList(200,300,400));

        //rooms go to same object therefore they both have the same elements

        System.out.println(list1); // 100,200,300,400
        System.out.println(list2); // 100,200,300,400

        System.out.println(list1 == list2); // is true

        System.out.println("--------------");

        Student student1 = new Student("Smynra", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1; // ==> only one object will be created => same room 2 entrances
        student2.name = "Maya";

        System.out.println(student1); // StudentName ='Maya', age=30, gender=M, grade=A, id=14
        System.out.println(student2); // StudentName ='Maya', age=30, gender=M, grade=A, id=14

        System.out.println(student1 == student2); // therefore is true

        System.out.println("-------------------------");
/*
        ArrayList<String> l1 = new ArrayList<>(); // first room
        l1.add("Java");
        ArrayList<String> l2 = new ArrayList<>(); // second room
*/
        // to access rooms from the others we need to do this
        ArrayList<String> l1 = new ArrayList<>(); // first room
        l1.add("Java");
        ArrayList<String> l2 = l1; // same room but we opened a new entrance which is l2
        // anything we add either to l1 or l2 will be in the same room therefore info will be added to both of them
        l2.add("Python");

        System.out.println("l1 = " + l1); // l1 = [Java, Python]
        System.out.println("l2 = " + l2); // l2 = [Java, Python]


    }
}
