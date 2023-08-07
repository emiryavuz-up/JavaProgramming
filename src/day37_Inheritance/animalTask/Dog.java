package day37_Inheritance.animalTask;

public class Dog extends Animal { // child class calls the constructor of the parent class


    public Dog(String name, String breed, char gender, int age, String size, String colour){
        super(name,breed,gender,age,size,colour); // functions get executed and variables will be set
    }

    public void bark(){ // unique method for dog class
        System.out.println(name + " is barking.");
    }



}


/*
class A{


}

class B{
    public A(){

    }
}
 */ // constructor name has to be the same as class name