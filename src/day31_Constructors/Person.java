package day31_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;
    //attributes every person has
    //to use them with different people, 1 copy for each person because they share these attributes

    public Person(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }




}
