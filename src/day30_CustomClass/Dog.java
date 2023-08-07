package day30_CustomClass;

public class Dog { // class is created to create object after to use it

    public String name; // instance variable, stores separate copies of Name
    public String breed; // instance variable, stores separate copies of Breed
    public int age; // instance variable, stores separate copies of Age
    public char gender; // instance variable, stores separate copies of Gender
    public String size; // instance variable, separate copies of Size
    public String colour; // instance variable, stores separate copies of Colour

    // Instances are created so that they can store different data

    // setInfo created as instance method to use each of the dog

    public void setInfo (String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColour){
    name = dogName; // name of the dog will be set to the instance of name
    breed = dogBreed; // breed of the dog will be assigned to breed instance variable that we created above
    age = dogAge; // dogAge will be assigned to age instance variable
    gender = dogGender; // dogGender will be set to the gender
    size = dogSize; // size will be dogSize
    colour = dogColour; // dogColour will be set to colour
    }

    public void eat(){ // instance method
        System.out.println(name + " is eating");
    }
    public void bark(){ // instance method
        System.out.println(name+ " is barking");
    }



    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}

/*

First specify the below to according to Dog Class

1st ==> Attributes:

  ->  name, age, gender, breed, size, colour

2nd ==> Actions:

  ->  eat(), play(), bark() ...

 */