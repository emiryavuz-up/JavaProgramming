package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    public String parrotWingColour; // extra instance variable unique to Parrot sub-class

    public Parrot(String name, String breed, char gender, int age, String size, String colour, String parrotWingColour) {
        super(name, breed, gender, age, size, colour); // 6 parameters // 6 instances that are set
        // constructor of the parent class and pass the 6 arguments to set them
        // if I ever create any object from the parent class, no need to worry about setting the instances
        // we can just call it by short-cut (option + enter 2x) or write it down manually :)
        this.parrotWingColour = parrotWingColour; // set manually
    }

    public void sing(){
        System.out.println(name +" is singing.");
    }



}
