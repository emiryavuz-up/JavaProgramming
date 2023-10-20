package day43_Abstraction.employeeTask;

public abstract class Person { // only responsible for creating the method, completing the method can be done by subclasses

// only way to access instance variables that has private access modifier, we use Getters & Setters
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    // sleep time may change per person, so it's abstract ==> it will be used with multiple implementations therefore
    // a body is not given
    // multiple implementation is needed for the sleep method, we do not worry about the details in the super class
    public abstract void sleep();

    // multiple implementation is needed for the eat method, we do not worry about the details in the super class
    public void eat(){
        System.out.println(name + " is eating regular human food.");
    }

    // what can be set, accessed through instances ==> defined by Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid Age: " + age); // unexpected event
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Name = " + name +
                "\nAge = " + age +
                "\nGender = " + gender;
    }
}
