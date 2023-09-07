package day44_Abstraction;

public final class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void scratch(){
        System.out.println(getAge() + " is scratching.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
    }


}
