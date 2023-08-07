package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"}; // C# s the unique element

        for (int j = 0; j < words.length; j++) { // from outer loop each time assign different words to element

            String element = words[j]; // this finds every word = "Java"
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { // responsible for finding the frequency from array

                if(words[i].equals(element)){ // if first element equals to rest of the words
                    frequency++; // increment frequency by one to find frequency of the element found above
                }

            }

            if(frequency == 1){
                System.out.println(element);
            }
        }




    }

}
