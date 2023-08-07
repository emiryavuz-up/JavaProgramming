package day37_Inheritance.scrumTask;

public class Employee extends Person{ // Employe IS A Person // Is A Relation

    //whatever can not be inherited => aren't included in the parent class Person
    // these instances are unique to Employee's => not students or any other class
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    // using super classes' constructor which is not default

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender); // mandatory for sub-class to call it, so it will be generated like this
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }
    // remaining variables are used by extends keyword and using the short cut to set them here by using super() keyword

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }
    public void onBreak(){
        System.out.println(jobTitle + " " + name + " is on break.");
    }

    // to be able to print employee object we have to create another toString to include job title, id, salary, company name
    public String toString() {
        // if i don't generate this when employee object is passed it only gives me name age and gender
        // if i want to include everything we need to generate toString method separately in the sub class
        return "Employee\n" +
                "\t name = '" + name + '\'' +
                "\t age = " + age +
                "\t gender = " + gender +
                "\t jobTitle = '" + jobTitle + '\'' +
                "\t id = " + id +
                "\t salary = $" + salary +
                "\t companyName = '" + companyName + '\'';
    }
}
/*
name,gender,age, jobTitle, id, salary, companyName
work(), toString()
 */