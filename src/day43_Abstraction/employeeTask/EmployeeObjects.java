package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Driver driver = new Driver("Smyrna", 25, 'M', 2315, "Driver", 40000);
        driver.sleep();
        driver.eat();
        driver.work();
        System.out.println(driver);
        System.out.println("----------------------------------------");
        Tester tester = new Tester("Simushy", 28, 'F', 4654223, "Full Stack Tester", 120000);
        tester.sleep();
        tester.eat();
        tester.work();
        System.out.println(tester);
        System.out.println("----------------------------------------");
        Teacher teacher = new Teacher("Simbushy", 22, 'M', 304315, "Teacher", 30000);
        teacher.sleep();
        teacher.eat();
        teacher.work();
        tester.bugReport();
        System.out.println(teacher);
        System.out.println("----------------------------------------");
        Developer developer = new Developer("Koca Kafa", 23, 'F', 410349, "Java Developer", 100000);
        developer.sleep();
        developer.eat();
        developer.work();
        developer.unitTest();
        System.out.println(developer);



    }

}
