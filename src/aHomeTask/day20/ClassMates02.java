package aHomeTask.day20;

public class ClassMates02 {

    public static void main(String[] args) {


        String[] names = {"java", "python", "c#"};

        for (int i = 0; i < names.length; i++) {

        String eachword = names[i];
        String reversedWord = "";

            for (int j = eachword.length()-1; j >= 0; j--) {
                char eachCh = eachword.charAt(j);
                reversedWord += eachCh;


            }


            System.out.println(reversedWord);
        }




    }
}
/*
            create string array, and store the names of your  classmates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
