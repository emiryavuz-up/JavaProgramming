package aHomeTasks.day27;

public class Retrieve {

    public static void main(String[] args) {


        String str = "Simushy!";

        String letters = "";
        String digits = "";
        String specialCharacters = "";

        for(char each : str.toCharArray()){
            if(each >= 'A' && each <= 'Z'){
                letters += each;
            }else if(each >= 'a' && each <= 'z'){
                letters += each;
            }else if(each >= '0' && each <= '9'){
                digits += each;
            }else{
                specialCharacters += each;
            }
        }
        System.out.println("Letters = " + letters + "\n" + "Digits = " + digits + "\n" + "specialChars = " + "\"" + specialCharacters + "\"");

        String letters2 = "";
        String digits2 = "";
        String specialChar2 = "";

        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                digits2 += each;
            }else if(Character.isLetter(each)){
                letters2 += each;
            }else if(Character.isWhitespace(each)){
                specialCharacters += each;
            }
        }
        System.out.println("Digits = " + digits + "\n" + "Letters = " + letters + "\n" + "specialChars = " + "\"" + specialCharacters + "\"");


        }


    }


/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Simushy!"

		output:
			letters= "Simushy";
			Digits = "";
			specialChars = " !";
 */