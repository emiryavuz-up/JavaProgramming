package aHomeTask.day13_14;

public class Exercise {

    public static void main(String[] args) {

        String str = "Hello";
        str += " World " + 5 + 10;
        System.out.println(str);

        String str2 = "Hello";
        int x = 10;
        str2 += x + 5;
        System.out.println(str2);

        String str3 = "Hello";
        int x1 = 10;
        str3 += (x1 + 5);
        System.out.println(str3);

        String s1 = "Hello";
        String s2 = " World";
        s1 += s2 += " Java";
        System.out.println(s1);
        System.out.println(s2);

    }

}
