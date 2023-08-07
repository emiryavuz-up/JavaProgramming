package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123"; // this string can be converted to a number as a whole => decimal or int

        Integer.parseInt(str);

        int number = Integer.parseInt(str); // it returns int value so assigned to number

        System.out.println(number + 1); // 124 => int so + becomes operator
        System.out.println(str + 1); // 1231 => String so + becomes concatenation

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1); // 11.5 because it's double now and not String

        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1); // if it's anything other than true
                                              // output will be false
        System.out.println(r1);
        
        String s2 = "123";
        
        Integer.valueOf(s2); // Integer => Wrapper Class
        
        Integer x = Integer.valueOf(s2); // so assigned back to Integer

        int y = Integer.valueOf(s2); // unboxing

        System.out.println("x = " + x);

        // isDigit

        char ch1 = '!';

        Character.isDigit(ch1);

        boolean r2 = Character.isDigit(ch1);

        Character.isLetter(ch1);

        boolean r3 = Character.isLetter(ch1);

        Character.isLetterOrDigit(ch1);

        boolean r4 = ! Character.isLetterOrDigit(ch1); // IF IT IS NOT LETTER OR DIGIT => SPECIAL CHAR

        boolean r5 = Character.isUpperCase(ch1);

        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("is digit = " + r2);

        System.out.println("is letter = " + r3);

        System.out.println("is special character = " + r4);

        System.out.println("r5 = " + r5);

        System.out.println("r6 = " + r6);
        
        String s = "ab1cde2efg3hi4";
        
        // find sum of all digits
        
        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){ // if any of the character is digit
                sum += Integer.parseInt("" + each); // converted String s to Integer
                
            }
        }
        System.out.println("sum = " + sum);


    }


}
