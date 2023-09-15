package day39_Recap.personTask;

public class Developer extends Employee{ // developer gets richer than Employee by inheriting its attributes

    // Employee has 6 fields, 6 getter and 6 getters, so we have to call that in this subclass
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    // job title and name is private in the super class, so we have to use getter and setter method
    public void fixingBugs(){
        System.out.println(getJobTitle() + ", " + getName() + " is fixing bugs.");
    }

    @Override
    public void work() {System.out.println(getJobTitle() + ", " + getName() + " is developing the software");
    }

}

/*
 Create a subclass of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */