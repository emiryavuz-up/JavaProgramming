package day14_String;

public class StringMethods01_IndexOf {

    public static void main(String[] args) {

        // GETTING INDEX NUMBERS OF THE STRING CHARACTERS


        String str1 = "    batch 25        ";
      str1 =  str1.trim(); // "batch 25"
        System.out.println(str1); // if you don't assign it back, to update, assign it back

    //trim method is used to clean the white spaces


        System.out.println("------------------");

        String str2 = "CodeBastards School";

        int n1 = str2.indexOf("h");

        System.out.println(n1);

        int n2 = str2.indexOf("ool"); // we wanted to get the "o" but added additional "ol" to make it unique

        System.out.println(n2);

        String str3 = "Java Programming Language"; // GET THE A

        int n3 = str3.indexOf("amming"); // we had to make it unique because there were 2 more "a" before.

        System.out.println(n3);

        int n4 = str3.indexOf("gua"); //

        System.out.println(n4);

        int n5 = str3.lastIndexOf("g"); // looks from right to the left unlike indexOf

        System.out.println(n5);

        String s = "Java Nova Cava Wawa Orange";

        int firstA = s.indexOf("a"); // to get the first "a", writing "a" is enough.
        System.out.println(firstA);

        int lastA = s.lastIndexOf("a"); // to get the last a // starting from right
        System.out.println(lastA);

        int secondA = s.indexOf("a ");
        System.out.println(secondA);

        int thirdA = s.indexOf("a C");
        System.out.println(thirdA);

        int fourthA = s.lastIndexOf("av");
        System.out.println(fourthA);

        int fifthA = s.lastIndexOf("va") + 1;
      //  int fifthA = s.lastIndexOf("a W");
        System.out.println(fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println(sixthA);

        // int seventhA = s.indexOf("wa O");
        int seventhA = s.lastIndexOf("a ");
        System.out.println(seventhA);



}

}