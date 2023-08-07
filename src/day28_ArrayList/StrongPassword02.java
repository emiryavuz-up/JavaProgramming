package day28_ArrayList;

public class StrongPassword02 {

    public static void main(String[] args) {

    String password = "smyRna2018@";

    int countUpperCase = 0; // temporary value
    int countLowerCase = 0;
    int countDigits = 0;
    int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }

            // how many upper, lower case, digits, and special chars

        }

        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigits = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

      // boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasLowerCase && hasUpperCase && hasDigits;

        boolean strongPassword = false;

        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowerCase){
                        if(hasDigits){
                            if(hasDigits){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }


        System.out.println("Strong Password = " + strongPassword);


    }
}
