package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try {
            System.out.println(8 / 0); // UNCHECKED EXCEPTION SO THROWS KEYWORD CAN NOT BE USED
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("Test Completed");

    }

}
