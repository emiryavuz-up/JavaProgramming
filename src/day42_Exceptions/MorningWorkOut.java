package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("---------------Push up Started---------------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up " + i); // prints in one line, each time it replaces the previous statement

            customSleep(1.5);

        }
        System.out.println();

        System.out.println("---------------Push up Completed---------------");

        System.out.println("---------------Pull up Started---------------");

        for (int i = 1; i <= 20; i++) {

            System.out.print("\rPull up " + i); // prints in one line, each time it replaces the previous statement

            customSleep(1);


        }

        System.out.println();

        System.out.println("---------------Pull up Completed---------------");






    }

    public static void customSleep(double seconds){
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
