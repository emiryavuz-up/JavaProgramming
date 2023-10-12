package day52_FunctionalInterface;

public class Test {

    public static void main(String[] args) {


        // function1 : create a function that can display a number is odd or even
        FirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if(n%2 == 0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        // function2 : create a function that can check if a person is eligible
        FirstFunctionalInterface eligibleToBuyTobacco;
        eligibleToBuyTobacco = (age) -> {
            if(age >= 21){
                System.out.println("Eligible to buy tobacco");
            }else{
                System.out.println("Not eligible to buy tobacco");
            }
        };

        eligibleToBuyTobacco.apply(10);

        // function3 : create a function that can display the cube

        FirstFunctionalInterface printCube = (cube) -> {System.out.println(cube*cube*cube);};

        printCube.apply(3);

        // function4 : create a function that can check if a number is evenly divisible
        FirstFunctionalInterface divisibleBy3And5 = n -> {
            if(n % 15 == 0){
                System.out.println(n + " is divisible by 3 and 5");
            }else{
                System.out.println(n + " is not divisible by 3 and 5");
            }
        };



    }

}
