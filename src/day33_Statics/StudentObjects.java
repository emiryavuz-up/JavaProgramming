package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Smyrna", 'F');

        System.out.println(student1);

        Student student2 = new Student("Maya", 'F', 5, 1239);

        System.out.println(student2);

        Student student3 = new Student("Jager", 'M', 2, 54, 'B');

        System.out.println(student3);

        Student student4 = new Student("Leika", 'F', 1, 21397, 'A');

        System.out.println(student4);


        System.out.println(student1 == student2);


        Student[] students = {student1, student2, student3, student4};


        System.out.println(Arrays.toString(students));

    }
}
