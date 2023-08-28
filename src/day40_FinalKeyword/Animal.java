package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;  // unchangeable
    private final char gender;  //  unchangeable
    private final String colour; // unchangeable
    private String size; // can be changed
    private int age; // can be changed

   /* // IT WILL BE SET IN THE CONSTRUCTOR SO FINAL VARIABLE CAN NOT BE SET FOR THE SECOND TIME
    public void setBreed(String breed){
        this.breed = breed;
    }
    */

    // by the time object is created, these instance variables will be set! CONSTRUCTOR
    public Animal(String name, String breed, char gender, String colour, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.colour = colour;
        this.size = size;
        this.age = age;
    }

    // SETTER ULTIMATE GOAL IS TO CHANGE THE VARIABLE, BUT FINAL IS UNCHANGEABLE ==> THEREFORE WITH FINAL VARIABLES, SETTER METHODS CAN NOT BE USED
    // 6 GETTER  ==> FOR THOSE 6 VARIABLES ABOVE REGARDLESS IF THEY ARE FINAL OR NOT
    // 3 SETTER

    //// ---------------GETTERS---------------------------------
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public char getGender() {
        return gender;
    }
    public String getColour() {
        return colour;
    }
    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;
    }
    //// ------------------Setters--------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //// ------------------Setters--------------------------
    // by overriding, this method will have different implementation
    public void eat(){
        System.out.println(name + " is eating."); // cat food, dog food, animals eat different food, so it will be changeable
    }
    // this method can not be changed by overriding
    public final void drink(){
        System.out.println(name + " is drinking water."); // all animals drink water // it should be unchangeable
    }

}
