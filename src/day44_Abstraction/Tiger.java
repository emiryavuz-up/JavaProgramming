package day44_Abstraction;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void tigers(){
        System.out.println(getName() + " is being a tiger.");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer.");
    }




}
