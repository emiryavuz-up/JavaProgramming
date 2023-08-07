package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {


        for(int i = 65; i <= 90; i++){ // given int to find the ascii table equivalent
            System.out.print((char) i +" "); // casted to char to print the char instead of a number
        }

        System.out.println();

        for(char i = 'A'; i <= 'Z'; i ++){
            System.out.print(i+" ");
        }

        System.out.println();

        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        for(char i = 1; i <= 40000; i++){
            System.out.print(i+" "); // characters will be displayed according to ASCII table
        }

    }
}
/*

print:
A~Z  = ASCII = 65 TO 90
a~z
Z~A
z~a

 */