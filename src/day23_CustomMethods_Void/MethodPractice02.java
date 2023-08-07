package day23_CustomMethods_Void;

public class MethodPractice02 {

    // create a function that can print hello world 5 times

    // create a function that can print hello CodeBastards 5 times

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println();
        noWordsChosen5Times();
    }

    public static void helloWorld5Times(){

        String word = "Hello World";
        String word2 = "No words chosen";

        for (int i = 0; i < (5); i++) {

            System.out.print (word + " ");
        }


    }

    public static void noWordsChosen5Times(){
        String word2 = "No words chosen";

        for (int i = 0; i < 5; i++) {

            System.out.print(word2 + " ");
        }

    }




}
