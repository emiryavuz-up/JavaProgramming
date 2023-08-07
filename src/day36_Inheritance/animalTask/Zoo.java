package day36_Inheritance.animalTask;

public class Zoo extends Animal {

    public static void main(String[] args) {

        Dog dog = new Dog(); // shares the methods and variables of Animal Super Class
        dog.setInfo("Smyrna", "Golden", 'F', 5, "Very Big", "White");
        dog.bark();
        dog.sleep();
        dog.eat();
        dog.drink();
        dog.move();
        System.out.println(dog);

        Cat cat = new Cat(); // can share the methods and variables of Animal Super Class
        cat.setInfo("Limon", "Stray", 'F', 5, "Regular", "Gray");
        cat.scratch();
        cat.meow();
        cat.sleep();
        cat.eat();
        System.out.println(cat);

        Tiger tiger = new Tiger(); // can share the methods and variables of Animal Super Class
        tiger.setInfo("Aksel", "Bengal", 'M', 4, "Small", "Brown");
        tiger.roar();
        tiger.hunt();
        tiger.eat();
        tiger.sleep();
        System.out.println(tiger);

    }

}
