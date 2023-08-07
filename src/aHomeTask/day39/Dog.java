package aHomeTask.day39;

public class Dog extends FriendlyAnimal{


    public Dog(String name, String breed, String size, String colour, char gender, int age) {
        super(name, breed, size, colour, gender, age);
    }

    public void bark(){
        System.out.println(getName() + " is barking.");
    }

}
/*
 Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */