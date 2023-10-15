package day34_GarbageCollection_AccessModifiers;

public class Student {

    public String studentName;
    public static String schoolName; // static variable that can be set in 1 step

    public Student(String studentName){

        this.studentName = studentName;

    }

    static{
        schoolName = "QA Engineer School";
    }

    public String toString() {
        return "Student{" +
                "studentName='" + studentName +
                "schoolName='" + schoolName;
    }
}


class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Jimmy");
        Student student2 = new Student("Kimmy");


        System.out.println(student1);
        System.out.println(student2);

    }

}
