package day44_Abstraction;

public final class Tiger extends Animal{
    public Tiger(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void tigers(){
        System.out.println(getName() + " is being a tiger.");
    }
}
