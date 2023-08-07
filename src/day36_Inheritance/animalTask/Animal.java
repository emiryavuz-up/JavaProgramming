package day36_Inheritance.animalTask;

public class Animal {

    // this class has to be created first to be the parent class
    // parent class is a class that contains features that are meant to be inherited
    // only common features should be added here
    // all the methods and variables will be used in other classes
    // we just declare them one time to make creating sub classes easier

    public String name, breed; // instance variables
    public char gender; // instance variable created to contain different copy for each objects
    public int age;
    public String size;
    public String colour;

    public void setInfo(String name, String breed, char gender, int age, String size, String colour){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

/*
Animal:
		name, breed, gender, size, age, colour
		setInfo(), eat(), drink(), move(), sleep(), toString()

 */