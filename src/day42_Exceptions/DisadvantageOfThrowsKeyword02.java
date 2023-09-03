package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword02 {

    public static void main(String[] args) {


    }


    // 2 ways to handle the below checked exception
    public static void method1() throws FileNotFoundException {

        new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {

        method1();

    }

    public static void method3() throws FileNotFoundException, InterruptedException {

        method2();
        Thread.sleep(1000);
    }

    public static void method4() throws FileNotFoundException, InterruptedException {
        method3();
    }

}
