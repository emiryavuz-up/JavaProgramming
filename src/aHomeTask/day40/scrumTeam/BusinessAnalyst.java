package aHomeTask.day40.scrumTeam;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary){
        super(name, age, gender, dnaCode, id, jobTitle, salary);
    }

    public void analyse(){
        System.out.println(getName() + ", " + getJobTitle() + " is analysing business.");
    }

}

/*
Create a subclass of Employee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have
 */
