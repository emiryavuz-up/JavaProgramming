package aHomeTask.day40.scrumTeam;

public class Employee extends Person{

        private int id;
        private String jobTitle;
        private double salary;

    public Employee(String name, int age, char gender, String dnaCode, int id, String jobTitle, double salary) {
        super(name, age, gender, dnaCode);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            System.err.println("Invalid ID: " + id);
            return;
        }
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle == null || jobTitle.isEmpty()){
            System.err.println("Invalid Job Title: " + jobTitle);
            return;
        }
        boolean hasNumber = false;
        for (char each : jobTitle.toCharArray()) {
            if(Character.isDigit(each)){
                hasNumber = true;
                break;
            }
        }
        if( !(hasNumber) ){
            this.jobTitle = jobTitle;
        }else{
            System.err.println("Invalid Job Title: " + jobTitle);
            System.exit(1);
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Invalid Salary : " + salary);
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getJobTitle() + ", " + getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee:" +
                "\nID = " + id +
                "\nJob Title = " + jobTitle +
                "\nSalary = " + salary +
                "\nDna Code = " + dnaCode;
    }


}

/*
Create a subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inherited setInfo() to set the name, age, and gender

				work()

				toString(): generate toString separately in Employee class so that name, age, gender, id, jobTitle and salary of the employee can be displayed
 */