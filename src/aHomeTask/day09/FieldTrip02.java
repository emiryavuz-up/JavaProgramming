package aHomeTask.day09;

public class FieldTrip02 {

    public static void main(String[] args) {

    /*
        FieldTrip. Your school goes on a Field trip each year.
        The place you go will be based on your grade.
        Given a variable gradeNumber (1-6) figure out the details of your field trip.
        Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

         */

        int grade = 4;
        String location = "";
        int groups = 8;
        String teacher = "";
        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orchard";
                groups = 8;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groups = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie Theater";
                groups = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                groups = 5;
                teacher = "Ms. Lela";
            } else {
                location = "Six Flags";
                groups = 8;
                teacher = "Mr. Watt";
            }

        } else {
            System.out.println("Invalid");
        }
        System.out.println("Location: " + location + "\n" + "Groups: " + groups + "\n" + "Teacher: " + teacher);
    }
}