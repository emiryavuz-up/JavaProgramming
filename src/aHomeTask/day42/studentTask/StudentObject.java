package aHomeTask.day42.studentTask;

public class StudentObject {

    public static void main(String[] args) {

        CodeStudent codeStudent1 = new CodeStudent("Smyrna", 27, 'M',
                4561, "Information Technology", 'A', "Oxford", "Java");

        System.out.println(codeStudent1);

        codeStudent1.eat();

        codeStudent1.sleep();

        System.out.println("--------------------------------------------------------");

        GraduateStudent graduateStudent1 = new GraduateStudent("Simushy", 6, 'F', 4915, "Python and Selenium", "MIT", 'A');

        System.out.println(graduateStudent1);

        graduateStudent1.eat();

        graduateStudent1.sleep();

        graduateStudent1.study();



    }




}

/*
Create a class named StudentObjects:

						Create the objects of each subclasses

						test all the functions of each objects

            			Analyze the relationships between the classes


 */