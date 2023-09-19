package day47_Polymorphism;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice02 {


    public static void main(String[] args) {

        Employee[] employees = {

                new Tester("Kobe", 32, 'M', 1, "QA", 110000),
                new Developer("Lebron", 27, 'F', 2, "Java Developer", 128000),
                new Tester("Curry", 28, 'M', 3, "SDET", 120000),
                new Developer("Wade", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Jordan", 30, 'M', 5, "SDET", 105000),
                new Developer("Rose", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Howard", 28, 'F', 7, "QE", 120000),
                new Developer("Damian", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Roy", 25, 'F', 9, "SDET", 130000),
                new Developer("Allen", 26, 'F', 10, "Back-end Developer", 150000),
                new Tester("Kyrie", 29, 'M', 11, "SDET", 115000),
                new Developer("McGrady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Paul George", 24, 'F', 13, "QE", 125000),
                new Developer("Lavine", 26, 'M', 14, "Full Stack Developer", 142000),
                new Tester("Antetokounmpo", 30, 'M', 15, "SDET", 105000),

        };

        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Tester || employee instanceof Developer) {
                scrumMembers.add(employee);
            }
        }

        System.out.println("----------------------------------");

        List<Tester> testers = new ArrayList<>();

        List<Developer> developers = null;

        for (Employee scrumMember : scrumMembers) {

            if (scrumMember instanceof Tester) {

                // you can't assign employee to a tester, so you have to cast it
                testers.add((Tester) scrumMember);
            }

            developers = new ArrayList<>();

            if (scrumMember instanceof Developer) {

                developers.add((Developer) scrumMember);
            }
        }

        Tester testerWithMaxSalary = testers.get(0);

        Developer developerWithMaxSalary = developers.get(0);


    }




}

/*
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};

    		(import them from day43 package)

	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?


 */