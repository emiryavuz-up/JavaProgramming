package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJjjaavvvaCapsCapszaasdoadokdefeqCapscaPsCaPs";

        int frequency = 0;
        int caps = 0;

        for (int i = 0; i <= str.length()-4; i++) { // /i: 1,2,3,4,5,6,7 // to not go out of index bound!! -4 is used because next statement will go 4 by 4 and then eventually will go out of bound so here it will decrement that value by 4 each time it adds 4
           String eachSub = str.substring(i, i+4); // this would get out of index bound so above we substract at the same time
           // System.out.println(eachSub);

            if(eachSub.equalsIgnoreCase("Java")){
                frequency++;
            }else if(eachSub.equalsIgnoreCase("Caps")){
                caps++;
            }
        }

        System.out.println("\"Java\" occured: " + frequency + " times.");
        System.out.println("\"Caps\" occured: " + caps + " times.");

    }

}


/*
how many chars the word has,
			        create substring of 4 characters

			        write a program that can return the frequency of the "a" word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */

