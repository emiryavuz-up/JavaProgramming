package day24_CustomMethods_Return;

public class ReturnMethodPractice03 {

    public static void main(String[] args) {

        // find unique characters

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i)); // frequency of every single character


            System.out.print(frequency);

            


        }



    }

//                                "aaa"        "a"
    public static int frequency(String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()) {

            if(each == ch){
                count++;
            }
        }

        return count;
    }

}
