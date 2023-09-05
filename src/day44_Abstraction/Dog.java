package day44_Abstraction;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " is barking.");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating dog food.");
    }



}
