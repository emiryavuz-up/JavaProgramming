package aHomeTask.day19;

public class DuplicateIndex {


    public static void main(String[] args) {

    String str = "abcdeffghzz";

    int indexNumber = -1;

        for (int i = 0; i < str.length(); i++) {

            char currentCh = str.charAt(i);

            boolean isDuplicate = false;

            for (int j = i + 1; j < str.length(); j++) {

                if(currentCh == str.charAt(j)){
                    indexNumber = i;


                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate){
                break;
            }


        }


        System.out.println("Index number of the first character is: " + indexNumber);
    }

}
/*
Write a program that can return the index number of the first duplicated character from a string
 */