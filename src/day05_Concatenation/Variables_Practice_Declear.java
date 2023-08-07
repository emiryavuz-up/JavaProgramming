package day05_Concatenation;

public class Variables_Practice_Declear {

    /*
    num1 = 100;
    num2 = 10000;
    num3 = 3.5;
    num4 = 2.5f;
    num5 = 999_999_999_999L; // because its out of int's range you write it with L to say its LONG
    num6 =850000;
     */

    public static void main(String[] args) {

        byte num1 = 100;
        int num2 = 10000;
        double num3 = 3.5;
        float num4 = 2.5f; //to specify it is float add "f"
        long num5 = 999_999_999_999L; // large number that's out of INT's range give "L"
        int num6 = 850000;


        // System.out.println(num4); this would only give you the data not what it stands for.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




        /*
        "123" + 1 = "1231"
        123 + 1 = 124
         */



    }
}
