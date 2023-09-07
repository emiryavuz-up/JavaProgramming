package day44_Abstraction;

public final class Dog extends Animal implements Playable{

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

    @Override
    public void play() { // public has to be given to override the method in the Interface because it's public by default
                            // therefore we can only give public access modifier when using it
        System.out.println(getName() + " is playing.");// you can not override a method by using less-visible access modifier


    }


}
