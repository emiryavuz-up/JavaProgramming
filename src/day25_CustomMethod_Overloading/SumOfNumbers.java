package day25_CustomMethod_Overloading;

public class SumOfNumbers {


    public static void main(String[] args) { // makes the class runnable

        int sum = sumOf2Numbers(10,20); // assigned to a variable named sum to be used again

        System.out.println(sum+"\n");

        int sumOf3 = sumOf3Numbers(10,20,30);

        System.out.println(sumOf3 + "\n");

        int sumOf4 = sumOf4Numbers(10,20,30,40);

        System.out.println(sumOf4);

    }

    public static int sumOf2Numbers(int num1, int num2){

        return  num1 + num2;

    }

    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }


    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){

        return  num1+num2+num3+num4;
    }
}
/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */