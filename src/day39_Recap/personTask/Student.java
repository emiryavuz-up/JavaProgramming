package day39_Recap.personTask;

public class Student extends Person{ // we only need Person classes' attributes in the Student class

    private int studentID;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID); // checks the conditions and do not directly assigns
        setFieldOfStudy(fieldOfStudy);  // checks the conditions and do not directly assigns
    }

    public int getStudentID(){
        return studentID;
    }

    public String getFieldOfStudy(){
        return fieldOfStudy;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy){
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName() + ", from " + getFieldOfStudy() + " is studying.");
    }

    @Override
    public String toString() {
        return
                "Name is: " + getName() + "\nAge is: " + getAge() + "\nGender is: " + getGender() +
                "\nStudent ID: " + studentID +
                "\nField Of Study: " + fieldOfStudy;
    }
}

/*
Create a subclass of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */
