package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

      // ERROR:  Dog dog1 = new Dog(); // can not use a default constructor because we don't have a default constructor in the Dog Class

        Dog dog1 = new Dog("Smyrna", "Golden", 'F', 5, "Huge", "Gold");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Limon", "Stray", 'F', 3, "Regular cat size", "Gray");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw",'M',3,"Small","Rainbow","Red");
        System.out.println(parrot1);
        parrot1.sing();

    }
}
