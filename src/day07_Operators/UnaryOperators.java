package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

            /*


   Unary Operators:
	++: increase the value by 1.
	-- : decreases the value by 1.

	Post vs Pre:
		Pre : changes the value immediately
				++ a
				-- a

		post: changes the value in the second step.
				a ++
				a --

     */


        int num1 = +25; // "+" is not required
        int num2 = -25; // "-" is required

        int a = 5;
        ++a; // pre-increment: it'll increase the value by 1 immediately.
        System.out.println(a); // result is then "6"
        --a; // pre-decrement: it'll decrease the value by 1 immediately.
        System.out.println(a);


        // POST INCREMENT & DECREMENT IS DIFFERENT!

        int b = 100;
        System.out.println(++b); //

        int c = 100;
        System.out.println(c++); // post increment: increases the value by 1 in the next step
        // first passes the current value then increases the value by 1
        System.out.println("c = " + c); // 101

        int x = 200;

        System.out.println( --x ); // pre decrement: decreases the value by 1 right away
        System.out.println("x = " + x); // 199

        int y = 200;

        System.out.println(y--); // post decrement: first gives you the current value then
                                        // in the next step it will decrease the value by 1

int i = 25;

        System.out.println("i = " + --i);

int t = 25;
        System.out.println(b++); // first value is 25 so it will be 25 but after
                                // b will be increased by one. next line it will be 26

        System.out.println(b--); // // it will print 26 first and then 25

        int z = 45;

        System.out.println(++z); // 46 z = 46
        System.out.println(z++); // first 46 as its current value and then 47
        System.out.println(z); // 47 as the result

        int q = 30;

        System.out.println(--q);  // it changes the value immediately so 29
        System.out.println(q--); // first step is it gives the current value 29,
                                // second step is it decreases the value of q by 1
        System.out.println(q); // so the value of q is 28 SINCE THIS IS THE NEXT CODE


        String _n = "Asd100";

        System.out.println("=================================");

        System.out.println(3+2 + "+" + 4+5);
        System.out.println("=================================");
        System.out.println("+" + 4 + 5);
        System.out.println( "================================");
        System.out.println(3+2+4+5);


    }


}
