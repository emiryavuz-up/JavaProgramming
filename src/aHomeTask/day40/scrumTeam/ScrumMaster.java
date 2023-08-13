package aHomeTask.day40.scrumTeam;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary) {
        super(name, age, gender, dnaCode, id, jobTitle, salary);
    }

    public void scrumMastering(){
        System.out.println(getName() + ", " + getJobTitle() + " is being a scrum master. Yeah that's it.");
    }



}
/*
Create a subclass of Employee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have

 */