package aHomeTasks.day40.scrumTeam;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary) {
        super(name, age, gender, dnaCode, id, jobTitle, salary);
    }

    public void develop(){
        System.out.println(getName() + ", " + getJobTitle() + " is developing the software.");
    }


}
/*
Create a subclass of Employee named Developer:

			Add any extra variable or method that Developer object need to have
 */
