package day14_String;

public class StringMethods04 {

    public static void main(String[] args) {

    String str = "CodeBastards"; // string is immutable, so it creates a new object of string below

    String str2 = str.repeat(4); //"CodeBastardsCodeBastardsCodeBastardsCodeBastards"

        System.out.println(str2);

        String s1 = "Simushy";
        String s2 = s1.repeat(100);
        System.out.println(s2);

    }

}
