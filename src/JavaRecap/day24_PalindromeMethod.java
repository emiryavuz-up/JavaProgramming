package JavaRecap;

public class day24_PalindromeMethod {


    public static void main(String[] args) {

        isPalindrome("level");

    }

    public static boolean isPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        boolean r1 = reversed.equalsIgnoreCase(str);
        System.out.println(r1);

        return r1;

    }
}




