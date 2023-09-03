package aHomeTask.day42.studentTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, String schoolName, char grade){
        super(name, age, gender, studentID, fieldOfStudy,schoolName,grade);
    }

    @Override
    public void study(){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter the number of seconds to study:");
            double seconds = scan.nextDouble();

            for (int i = 1; i <= seconds; i++) {
                System.out.print("\r" + getName() + " done studying for " + i + " " + "seconds");
                customSleep(1);
            }

            System.out.println();

        }catch (InputMismatchException e){
            System.err.println("Please enter a valid number.");
        }finally {
            scan.close();
        }


    }


}

/*
Create the following subclasses of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CodeStudent:

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
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included

 */