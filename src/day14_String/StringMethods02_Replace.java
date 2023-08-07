package day14_String;

public class StringMethods02_Replace {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        String str2 = str.replace("Java" , "Python"); // python is fun...

        System.out.println(str);
        System.out.println(str2);

        String email = "JohnSmith@yahoo.com";

        String email2 = email.replace("yahoo" , "gmail");
        System.out.println(email2);

        //remove python
        String sentence = "Java Java Python Python C# C# C++ Python Python Python Python ";
        String sentence2 = sentence.replace("Python " , "");
        sentence2 = sentence2.replace("   ", " "); // RE ASSIGNED
        System.out.println(sentence2);

        String s = "Dog Dog Dog Dog Dog Dog"; // if you don't assign it back it will give you the same
        s = s.replace("Dog" , "Cat"); // so its assigned again remember its immutable
        System.out.println(s);

        String s2 = "C# is fun, C# is cool"; // second C# will be changed
        s2 = s2.replace(" C#", " Java"); // one space is given before to make it unique
        System.out.println(s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println(s3);

        String result = "Java Java Java";
        result = result.replace("Java" , "Python");
        System.out.println(result);
        // all of them are replaced with java

        String result2 = "Java Java Java";
        result2 = result2.replaceFirst("Java", "Python");
        System.out.println(result2); // 1st java is replaced by python

        String result3 = "Java";
        result3 = result.replaceFirst("a", "e");
        System.out.println(result3);



    }

}
