package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(1.5);

        System.out.println("Hello World");

        System.out.println("------------------------");

        System.out.println("Hello");

        MorningWorkOut.customSleep(2.5); // Try & Catch Version of the Sleep Method

        System.out.println("World");

    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));

    }

}
