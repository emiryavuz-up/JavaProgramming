package day44_Abstraction;

public final class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void parrots(){
        System.out.println(getName() + " is being a parrot.");
    }
}
