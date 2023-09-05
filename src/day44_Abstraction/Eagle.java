package day44_Abstraction;

public final class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void eagles(){
        System.out.println(getName() + " is being an eagle.");
    }
}
