package day30_CustomClass;

public class Employee {

    // when used with object, they will have different copies, the name gender and everything
    // Employee class here is a blueprint of the object
    // instance variables belong to the object

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    // to set these attributes in an efficient way, which is to create a method
    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        // employee1.setInfo("John", 'M' ... );
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    // to print the objects with a method without getting hashCode

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime= $" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }


}
/*
Employee Class:

	Attributes:
		name, ID, gender, jobTitle, salary, isFullTime (true/false)

	Actions:
		toString(): --> to be able to print each employee object
		setInfo():  --> to be able to set all the attributes
		work():

 */