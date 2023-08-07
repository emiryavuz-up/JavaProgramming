package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        /*
        number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
         */

        int number = 65; // if there is a remainder it is not divisible therefore "%" is needed

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " Is Divisible By 2: " + divisibleBy2);
        System.out.println(number + " Is Divisible By 3: " + divisibleBy3);

    }


}
