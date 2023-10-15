package aHomeTasks.day16;

public class RetrieveCharNumSpecial {

    public static void main(String[] args) {

        String str = "randomlyGiven Words &&& 112391841";

        String digits = "";
        String specialCh = "";
        String letter = "";

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                letter += ch;
            }else if(ch >= 'a' && ch <= 'z'){
                letter += ch;
            }else if(ch >= '0' && ch <= '9'){
                digits += ch;
            }else{
                specialCh += ch;
            }

            }
        System.out.println("letters: "+letter +"\n"+ "digits: " + digits + "\n" + "special chars: " + specialCh);

        }

    }


/*
 5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */