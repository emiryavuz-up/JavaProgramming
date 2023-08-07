package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "CodeBastards12345School! @ £$%W oodenSpoon";


        String digits    = ""; // 12345...
        String letters   = "";// CodeBastardsSimushy
        String specialCh = "";// !@£$%

        // purpose is to contain and represent the characters

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // her bir karakteri al // each character in the "str"

            System.out.print(ch); // tum karakterleri yazdir

            if(ch >= '0' && ch <= '9'){ // also ascii table helps us to specify if its digit or not
                digits += ch; // digits i yukarida bulduktan sonra ch ye assign et
            }else if(ch >= 'A' && ch <= 'Z'){ // bulunan spesifik karakter buyuk A ve buyuk Z arasinda ise
                letters += ch; // letter i char a bagla
            }else if(ch >= 'a' && ch <= 'z'){ // karakter kucuk a ve z arasinda ise
                letters += ch; // letters i ch ye bagla
            }else{ // if none of the conditions above are matched
                specialCh += ch; // specialCh yi ch ye bagla
            }

            if(ch != ' '){ // if the special character is not a space
                specialCh += ch;
            }

        }

        System.out.println("----------------------------------------------------");

        System.out.println(digits);
        System.out.println(specialCh);
        System.out.println(letters);

    }

}
