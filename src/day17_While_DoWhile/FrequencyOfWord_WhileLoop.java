package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python"; // we will delete java one by one until nothing is left
                                               // and count each deletion, then add it to my frequency
        int frequency = 0;


        while(str.contains("Java")){
            str = str.replaceFirst("Java", ""); // this is to delete first Java // string is immutable so we assigned it back
            frequency++; // to check how many times the condition is executed
        }

        System.out.println(frequency);


        System.out.println("------------------------------------------");


        String sentence = "cat cat cat cat CAt cat CAt CAT CAT cAT cat CaCCTTccascad Cat Csat Cat";
        int countCat = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", ""); // start from first cat and then change it with blank so we basically delete it
            countCat++; // how many times the loop is executed? add each deletion to count cat, increment the value of this variable by 1 each time you detect "cat"
        }

        System.out.println(countCat);


        System.out.println("------------------------------------");

        String s = "Java java java java python java python python phython";

        int countJava = 0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){ // either python or java will make this condition true
            if(s.contains("java")){
                s = s.replaceFirst("Java", "");
                countJava++;
                }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

            System.out.println("countJava = " + countJava);
            System.out.println("countPython = " + countPython);
        }

    }
}
