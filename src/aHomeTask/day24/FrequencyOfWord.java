package aHomeTask.day24;

public class FrequencyOfWord {

    public static void main(String[] args) {

        int count = frequency("Cigdem cigdem cigdem cigdem emir koca kafa smyrna", "cigdem");

        System.out.println(count);

    }

    public static int frequency(String sentence, String word){

    int count = 0;

    sentence = sentence.toLowerCase();
    word = word.toLowerCase();

        String[] words = sentence.split(" "); // create an array to contain the words of sentence split by space

        for (String each : words) { // each is each word of the sentence
            if(each.equals(word)){ // if each of the sentence is equals to the word given in the frequency method
                count++; // increase count by 1
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