package JavaRecap;

public class day20_ReverseArray {
    public static void main(String[] args) {


        String[] arr = {"java", "python", "c#"};

        for (int i = 0; i < arr.length; i++) {

            String eachWord = arr[i];
            String reversedVersion = "";

            for (int j = eachWord.length()-1; j >= 0; j--) {
                char eachCh = eachWord.charAt(j);
                reversedVersion += eachCh;

            }
            System.out.println(reversedVersion);

        }


    }


}

/*
create string array, and store the names of your  class-mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */