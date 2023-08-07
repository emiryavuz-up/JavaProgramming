package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Cigdem", 'F', 27, 1414, 'A');

        Student student2 = new Student();

        student2.setInfo("Emir", 'M', 27, 1515, 'A');

        Student student3 = new Student();

        student3.setInfo("Smyrna", 'F', 5, 2020, 'F');

        Student student4 = new Student();

        student4.setInfo("Maya", 'F', 5, 2030, 'F');

        Student student5 = new Student();

        student5.setInfo("Limon", 'F', 3, 2040, 'C');


        ArrayList<Student> studentList = new ArrayList<>();

        studentList.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        /*
        // Access the student from the ArrayList
        Student retrievedStudent = studentList.get(0);
        System.out.println(retrievedStudent);
         */

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);
        }

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade a
        ArrayList<Student> angryBirds = new ArrayList<>(); // else

        for (Student each : students) {

            if(each.grade == 'A'){
                earlyBirds.add(each);

            }else{angryBirds.add(each);

            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

    }


}
