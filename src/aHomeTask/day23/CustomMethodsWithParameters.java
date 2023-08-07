package aHomeTask.day23;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {


        oddOrEven(10);

        ageOfPerson(1996);

        numbersBetween(10, 20);

    }

    public static void oddOrEven(int num){

        if(num / 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static void ageOfPerson(int birthYear){

        int age = 2023 - birthYear;

        System.out.println("Your age is " + age);
    }


    public static void numbersBetween(int x, int y){

        for (int i = x; i <= y; i++) {

            if(i != x && i != y){
                System.out.print(i +" ");
            }
        }

    }

}
/*
create a function that can check if a number is odd or even
 */