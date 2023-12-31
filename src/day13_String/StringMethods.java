package day13_String;

public class StringMethods {

    public static void main(String[] args) {
        
    String word = "CodeBastards";
          //index = 01234

        char thirdChar = word.charAt(3); // TO GET THE 4TH CHARACTER

        System.out.println("thirdChar = " + thirdChar);

        char tenthChar = word.charAt(4); // TO GET THE 4TH CHARACTER // 9 will give compiler error
                                        // error because CodeBastards has 5 characters
                                        // index number therefore is 5 in total. so 9 is compiler error

        System.out.println("tenthChar = " + tenthChar);


        System.out.println("-----------------------");

        String s1 ="Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt( s1.length() - 1); //  TO GET THE LAST CHARACTER
        System.out.println("lastChar = " + lastChar);


        System.out.println("-------------------------------");


        String str = "Simushy"; // ALL IN LOWER CASE // this is IMMUTABLE // cant be duplicated
        str.toUpperCase(); // "Simushy" will be created, a new one as a result since no duplication is possible
                            // last time str was initialized is line 39
                            // it won give you "Simushy" because you can only store one data!!!!!
                            // 2 objects but only one of them will be stored
                            // so when was the last time you created it? line 38
        System.out.println(str);

        // TO GET THE NEW VERSION YOU CAN ASSIGN IT TO A NEW STRING LIKE BELOW

        str = str.toUpperCase();
        System.out.println(str); // THIS WILL BE WRITTEN IN UPPER CASE SINCE YOU RE ASSIGNED IT


        String s = "Java";
        s.toUpperCase();





    }
    
}
