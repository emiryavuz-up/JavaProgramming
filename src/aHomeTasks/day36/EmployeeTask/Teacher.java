package aHomeTasks.day36.EmployeeTask;

public class Teacher extends Employee {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setInfo("Leika", "Automation Engineer Teacher", 'F', 23, 5366, 61875);
        System.out.println(teacher1);
        teacher1.work();

    }


}
/*
 Create the subclass of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()

 */