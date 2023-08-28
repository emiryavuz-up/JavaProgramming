package day40_FinalKeyword;

public final class Dog extends Animal{ // attributes of Dog Class can not be inherited by other classes


    public Dog(String name, String breed, char gender, String colour, String size, int age) {
        super(name, breed, gender, colour, size, age);
    }

    //eat method is overridden to make it unique for dog objects
    public void eat(){
        System.out.println(getName()+ " is eating the dog food.");
    }

    public void bark(){
        System.out.println(getName() + " is barking.");
    }



    /*
    public void drink(){
        System.out.println(getName()+ " is drinking water.");
    }
     */


}
