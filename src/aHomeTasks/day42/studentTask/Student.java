package aHomeTasks.day42.studentTask;

public class Student extends Person {


    public static void customSleep(double seconds){

        try {
            Thread.sleep( (long)(seconds * 1000) );
        }catch (InterruptedException e){

        }
    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, String schoolName, char grade){
        super(name, age, gender);
        this.studentID = studentID;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
        this.grade = grade;

    }

    private final int studentID;
    private final String fieldOfStudy, schoolName;
    private final char grade;


    public int getStudentID(){
        if(studentID <= 0){
            throw new ArithmeticException("Student ID can not be zero or negative.");
        }
        return studentID;
    }
    public String getFieldOfStudy(){
        if(fieldOfStudy == null || fieldOfStudy.isEmpty()){
            throw new IllegalArgumentException("Field of study can not be null or empty.");
        }
        for (char eachChar : fieldOfStudy.toCharArray()) {
            if( !Character.isLetterOrDigit(eachChar) && !Character.isSpaceChar(eachChar) ){
                throw new IllegalArgumentException("Name can not contain special character and/or space.");
            }
        }
        return fieldOfStudy;
    }

    public String getSchoolName(){
        if(schoolName == null || schoolName.isEmpty()){
            throw new IllegalArgumentException("Name can not be null or empty.");
        }
        for (char eachChar : schoolName.toCharArray()) {
            if( !Character.isLetterOrDigit(eachChar)){
                throw new IllegalArgumentException("Name can not contain special character and/or space.");
            }
        }
        return schoolName;
    }

    public char getGrade(){
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            throw new IllegalArgumentException("Grade must be valid.");
        }
        return grade;
    }


    public String toString(){
        return
                "Name:\t" + getName() + "\nAge:\t" + getAge() + "\nGender:\t" + getGender()
                + "\nSchool Name: " + getSchoolName() + "\nStudent ID:\t" + getStudentID()
                        + "\nField of Study:\t" + getFieldOfStudy() + "\nGrade:\t" + getGrade();
    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }



}


/*
Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. fieldOfStudy and schoolName should not be set to null
									2. fieldOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

 */