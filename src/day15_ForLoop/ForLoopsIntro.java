package day15_ForLoop;

public class ForLoopsIntro {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("\n------------------------------------------------");

//    for(int i = 1; i <= 10;){ // starting point of the loop // initialisation // infinite times hello world
  //      System.out.println("Hello World");

        //      1        2       3
        for(int i = 1; i <= 10; i++){ // i++ makes it false. when it reaches 11 it will stop and print 10
            // it's i++ and not if-- because if value goes backwards it means
            // it is not greater than 10 = infitine loop
            System.out.println("Hello World"); // number 3 in execution order

        }


    }

}
