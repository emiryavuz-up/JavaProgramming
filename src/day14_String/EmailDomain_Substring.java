package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "CodeBastards.School@gmail.com";

        //domain: // char at trim replace and sometimes substring
        int beginningIndex = email.indexOf("@") + 1; // email.substring(email.indexOf(0, '_')

        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain); // gmail

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0,11); // java is fun // normally 10 but 10 will be excluded so 11.

        int beg = str1.lastIndexOf(" J" + 1);
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end); // Java is cool

        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }


}
