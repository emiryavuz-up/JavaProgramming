package aHomeTasks.aInterviewQuestions;

public class Average {


    public static void main(String[] args) {

        // calculate average using array

        double[] array = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};

        double sum = 0.0;

        for (double number : array) {

            sum += number;

        }

     //   System.out.println(sum); // 166.14

        double totalLength = array.length;

     //   System.out.println(totalLength); // 6.0

        double average = sum / totalLength;

        System.out.println(average);

    }

}
