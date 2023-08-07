package day39_Recap.personTask;

public class PersonObjects {

    public static void main(String[] args) {

        Developer developer = new Developer("Smyrna", 3, 'F', 239523, " Java Developer", 600000);
        System.out.println(developer);
        developer.work();
        developer.fixingBugs();

        System.out.println("---------------------------");

        Tester tester = new Tester("Maya", 6, 'F', 23525, "Senior QA Engineer", 550000);
        System.out.println(tester);
        tester.work();
        tester.createTicket();

        System.out.println("---------------------------");

        Teacher teacher = new Teacher("Jager", 3, 'M', 41985,"Teacher", 350000);
        System.out.println(teacher);
        teacher.work();
        teacher.eat();

        System.out.println("---------------------------");

        Student student = new Student("Leika", 1, 'F', 1230, "IT");
        System.out.println(student);
        student.study();
        student.sleep();

        System.out.println("---------------------------");

        Employee employee = new Employee("Aksel", 5, 'M', 12355, "Employee", 500000);
        System.out.println(employee);
        employee.work();
        employee.drink();
    }

}

/*
Create a class named PersonObjects:

            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */