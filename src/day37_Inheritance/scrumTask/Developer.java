package day37_Inheritance.scrumTask;

public class Developer extends Employee{

// calling the constructor is mandatory for the sub-class when it's not default
    // all instances of Employee will be inherited by Developer
    // Developer may have different job titles!! therefore it's given as parameter to be set accordingly
    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName); // super shortcut calls the constructor of the super class
    }
    // developer class needs to have it's own method such as fixing bug which is unique to developers

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying");
    }

}
