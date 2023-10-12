package day52_FunctionalInterface;

public class Test02 {
    public static void main(String[] args) {

        SecondFunctionalInterface<String> printEach;

        printEach = s -> {

            for (String each : s.split("")) {
                System.out.println(each);
            }

        };

        printEach.test("Data");

        System.out.println("------------------------");

        SecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(5);

    }

}
