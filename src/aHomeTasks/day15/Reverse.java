package aHomeTasks.day15;

public class Reverse {

    public static void main(String[] args) {

        String str = "Java";
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println(reversed);

    }

}

/*
Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			                 0123
 */
