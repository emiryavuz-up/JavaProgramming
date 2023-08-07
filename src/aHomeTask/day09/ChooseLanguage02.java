package aHomeTask.day09;

public class ChooseLanguage02 {

    public static void main(String[] args) {

            /*
            ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
             */
/*
        int something = 1;

        if (something == 1) {
            System.out.println("Hello, thank you for you call");
        } else if (something == 2) {
            System.out.println("Hola, Gracias para LLamar");
        } else if (something == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (something == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (something <= 5) {
            System.out.println("Merci, pour votre appel");

 */

        int something = 1;
        String language;

        if (something == 1) {
            language = "Hello, thank you for your call";
        } else if (something == 2) {
            language = "Hola, Gracias para LLamar";
        } else if (something == 3) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        } else if (something == 4) {
            language = "Privet, spasibo za vash zvonok";
        } else {
            language = "Merci, pour votre appel";
        }
        System.out.println("language = " + language);
    }

}