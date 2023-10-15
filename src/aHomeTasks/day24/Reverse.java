package aHomeTasks.day24;

public class Reverse {

    public static void main(String[] args) {

    String reverseFunction = reverse("Java");

        System.out.println(reverseFunction);

    }

    public static String reverse(String word){

        String reversed = "";



        for (int i = word.length()-1; i >= 0; i--) {
            String eachChar = "" + word.charAt(i);
            reversed += eachChar;
        }
        return reversed;
    }

}

/*
create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */