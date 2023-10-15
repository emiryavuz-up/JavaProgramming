package aHomeTasks.day40.scrumTeam;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary){
        super(name, age, gender, dnaCode, id, jobTitle, salary);
    }

    public void ownTheProduct(){
        System.out.println(getName() + ", " + getJobTitle() + " owns the product??? Yeah this guy's weird.");
    }


}

/*
Create a subclass of Employee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have
 */