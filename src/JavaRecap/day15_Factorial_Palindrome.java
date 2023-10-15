package JavaRecap;

public class day15_Factorial_Palindrome {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        System.out.println("-----------------");

        String str = "Level";
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        boolean r1 = str.equalsIgnoreCase(reversed);
        System.out.println(r1);

        /*
        if(reversed.equalsIgnoreCase(str)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
         */

    }

}

/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */