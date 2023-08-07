package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

//  IMPLICIT CASTING
//  double > float > long > int > short > byte
        // Smaller primitive types can be directly assigned to a larger primitive type

        byte a = 100;
        short b = a;
        // short c = (short)a;     // (short)a
        int c = b;
        // int c = (short)b;
        long d = c;
        // long d = (long)c;
        float e = d;
        double f = e;

        // EXPLICIT CASTING

        // larger primitive types can not be directly assigned to a smaller primitive types


        int x = 55;
        short y = (short) x; // explicit casting

        System.out.println(x + " : " + y);

        int j = 102131000;
        short k = (short) j; // "manually casted to short!"

        System.out.println(j + " : " + k);

        double l = 2.5;
        float n = (float) l;

        System.out.println(l + " : " + n);

        double o = 10.8;
        int s = (int) o; // 10

        System.out.println(o + " : " + s);
        System.out.println("==================");

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);


        float f1 = 30.5F; // put "F" at the end to specify it as FLOAT since by default it's int
        long l1 = (long) f1;
        System.out.println(f1 + " : " + f1);

    }

}

// short s1 = d1; // alt + enter to fix
