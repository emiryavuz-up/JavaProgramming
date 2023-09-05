package day44_Abstraction;

public final class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void scratch(){
        System.out.println(getAge() + " is scratching.");
    }
}
