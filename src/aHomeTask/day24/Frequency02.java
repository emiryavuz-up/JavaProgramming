package aHomeTask.day24;

public class Frequency02 {

    public static void main(String[] args) {

        int count = frequency("java java java python python c# c##", "java");

        System.out.println(count);

    }

    public static int frequency(String sentence, String word){


        String[] words = sentence.split(" ");

        int count = 0;
        for (String each : words) {
            if(each.equals(word)){
                count++;
            }

        }
        return count;
    }

}

/*
  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
  then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */