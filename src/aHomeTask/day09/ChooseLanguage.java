package aHomeTask.day09;

public class ChooseLanguage {

    public static void main(String[] args) {


        /*
         called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

         */

        int number = 1;

        if (number == 1) {
            System.out.println("Hello, thank you for you call");
        } else if (number == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (number == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (number == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (number == 5) {
            System.out.println("Merci, pur votre appel");
        }


    }

}
