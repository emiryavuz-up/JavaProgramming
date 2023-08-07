package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Jager", "Jager", "Limon", "TomTom", "Maya", "Maya", "Maya", "Tom", "Tom", "Smyrna"}; // C# s the unique element

        for (String each : words) { // every element in the array word ==> Jager Jager Limon...

            int count = 0;

            for (String element : words) { // element represents the word found after 1st,2nd,3rd outer loop

                if(element.equals(each)){
                    count++;
                }

            }

            if(count == 1){ // if the element is equal to one ==> unique
                System.out.println(each);
            }

        }



    }

}
