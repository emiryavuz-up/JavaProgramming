package aHomeTask.day24;

public class Reverse02 {

    public static void main(String[] args) {

        String reversedVersion = reverse("java");

        System.out.println(reversedVersion);
    }

    public static String reverse(String str){

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            char eachCh = str.charAt(i);
            reversed += eachCh;

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