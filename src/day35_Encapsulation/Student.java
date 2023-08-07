package day35_Encapsulation;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName; // school name is same for all students therefore it's static
    public String fieldOfStudy;
    public static String programmingLanguage; // programming language is same for all students therefore it's static
    public static String secretCode; // secret code is same for all students therefore it's static

    public Student(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{ // static block is used to set static variables which will give the same value to each of the object
        schoolName = "Mars";
        programmingLanguage = "Java";
        secretCode = "Alien Language";
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "Student\n" +
                "name=\t=" + name + '\'' +
                ", gender\t=" + gender +
                ", age\t=" + age +
                ", batchNumber\t=" + batchNumber +
                ", groupNumber\t=" + groupNumber +
                ", fieldOfStudy\t='" + fieldOfStudy + '\'' +
                ", school\t='" + schoolName + '\'' +
                ", programmingLanguage\t='" + programmingLanguage + '\'';
    }

}
    /*
2. create a class named Student
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */