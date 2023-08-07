package day39_Recap.personTask;

public class Person {

    // private instances are created to have control => conditions has to be met before setting their value
    private String name;
    private int age;
    private char gender;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    public Person(String name, int age, char gender){
        if(!name.isBlank() || !name.isEmpty()){
            setName(name);
        }
        if(age > 0 && age < 120){
            setAge(age);
        }
        if(gender == 'M' || gender == 'F'){
            setGender(gender);
        }
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString(){
        return
                "Name is: " + name + "\nAge is: " + age + "\nGender is: " + gender;
    }

}

/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()

 */