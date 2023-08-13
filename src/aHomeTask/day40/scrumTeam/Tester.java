package aHomeTask.day40.scrumTeam;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary) {
        super(name, age, gender, dnaCode, id, jobTitle, salary);
    }

    public void test(){
        System.out.println(getName() + ", " + getJobTitle() + " is testing the software.");
    }


}

/*
Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have

 */
