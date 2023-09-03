package aHomeTask.day42.studentTask;

public class CodeStudent extends Student{

    private final String programmingLanguage;

    public CodeStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName, String programmingLanguage){
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
        this.programmingLanguage = programmingLanguage;

    }

    public String getProgrammingLanguage() {

        if(programmingLanguage == null || programmingLanguage.isEmpty()){
            throw new IllegalArgumentException("School Name can not be null or empty");
        }
        for (char eachChar : programmingLanguage.toCharArray()) {
            if(!Character.isLetterOrDigit(eachChar)){
                throw new IllegalArgumentException("School Name can not contain special character and/or space.");
            }

        }
        return programmingLanguage;
    }

    @Override
    public void eat(){
        System.out.println(getName() + " who's the master of " + getProgrammingLanguage() + " is eating.");
    }

    @Override
    public void sleep(){
        System.out.println(getName() + " who's the master of " + getProgrammingLanguage() + " is sleeping.");
    }

    @Override
    public void drink(){
        System.out.println(getName() + " who's the master of " + getProgrammingLanguage() + " is sleeping.");
    }

    @Override
    public String toString(){
            return
                    "Name:\t" + getName() + "\nAge:\t" + getAge() + "\nGender:\t" + getGender()
                            + "\nSchool Name:\t" + getSchoolName() + "\nStudent ID:\t" + getStudentID()
                            + "\nField of Study:\t" + getFieldOfStudy() + "\nGrade:\t" + getGrade() + "\nProgramming Language: " + getProgrammingLanguage();

    }


}
/*
CodeStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included */
