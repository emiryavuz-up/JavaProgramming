package aHomeTasks.day18;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // 0,1,2,3,4,5,6 == 6 karakter

            int count = 0;

            for (int j = 0; j < str.length(); j++) { // this one finds the frequency

                char each = str.charAt(j); // 6x = 0,1,2,3,4,5,6,0,1,2,3,4,5,6,0,1,2,3,4,5,6...  6 kere her 6 karakter

                if(ch == each){
                    count++;
                }

            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }

        System.out.println(result);
    }

}

/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
