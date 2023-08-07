package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {


        // find the maximum number between 100 ~ 200

        max(100,200);

        int maxNumber = max(100,200); // 200, it is a value, so it will be assigned.

        System.out.println("Max number is: " + maxNumber);

        // multiply the max number by 2

        int multiplication = maxNumber * 2;

        System.out.println("Multiplication: " + multiplication);


    }

    public static int max(int a, int b){

      int result = 0; // variable created to store the max number

        if( a > b){
            result = a;
        }else{
            result = b;
        }

        return result;

    }

}
