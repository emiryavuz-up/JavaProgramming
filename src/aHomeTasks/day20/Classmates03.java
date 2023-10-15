package aHomeTasks.day20;

public class Classmates03 {

    public static void main(String[] args) {

        String[] names = {"java", "python", "c#"};

        for (int i = 0; i < names.length; i++) {
            String eachWord = names[i];

            String result = "";

            for (int j = eachWord.length()-1; j >= 0; j--) {
                char eachCh = eachWord.charAt(j);
                result += eachCh;
            }

            System.out.println(result);
        }


    }

}
/*
ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */