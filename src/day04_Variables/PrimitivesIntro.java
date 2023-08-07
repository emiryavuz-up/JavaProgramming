package day04_Variables;

public class PrimitivesIntro {

    /*
    Variables

int: for all integers

double: for decimals

char: for single character GIVE WITHIN A SINGLE QUOTE 'N'

boolean: true / false
     */

    public static void main(String[] args) {

        // age: 128 years old

        //data type
        byte age = 127;

        // weight: 128kg

        //   byte weight: 128 byte; 128 is out of byte' range
        //   byte num: -129; // -129 is out of byte' range

        short weight = 160;

        // salary: 1000_000_0 $

        // short salary = 100_000_0;

        int salary = 100_000_0;

        long asset = 3_333_333_33L; // PAY ATTENTION TO "L" use it specify that it's long
        // because system by default takes it anything as INT long as its in the range
        // so when you type in anything out of its range you get error

        //tax 0.26

        float tax = 0.26F;  // this F also to say its float because default is double

        double PI = 0.26;

        // int and double is the default usage! so pay attention to them!


        // #


        char ch1 = '!';

        System.out.println("ch1 = " + ch1);

        char ch2 = 36;
        System.out.println("ch2 = " + ch2);

        char ch3 = 41;
        System.out.println("ch3 = " + ch3);


        char ch4 = 3;
        System.out.println("ch4 = " + ch4);

        char yesNo = 'N';
        char grade = 'A';
        char isMarried = 'Y';

        System.out.println("yesNo = " + yesNo);

        boolean result = 100 > 300;

        boolean isEmployed = true;

        boolean isGood = false;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);

        String name = "Talkative Moth";
        System.out.println("name = " + name);

        String City = "Los Angeles";
        System.out.println("City = " + City);

        int number = 1503135;
        System.out.println("number = " + number);

        double the_other_number = 3014.3916839;
        System.out.println("the_other_number = " + the_other_number);

        String dont_know = "Los Angeles 55555 M $";
        System.out.println("dont_know = " + dont_know);



    }


}
