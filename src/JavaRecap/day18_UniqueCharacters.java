package JavaRecap;

public class day18_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char eachCh = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char eachCh2 = str.charAt(j);

                if(eachCh == eachCh2){
                    frequency++;
                }
            }

            if(result.contains(eachCh + "")){
                continue;
            }

            result += eachCh;
            result += frequency;
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


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */