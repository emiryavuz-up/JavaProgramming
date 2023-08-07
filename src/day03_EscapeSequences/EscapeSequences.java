package day03_EscapeSequences;

/*
escape sequences
\n = starts a new line = advances the cursor
\t = horizontal tab = causes the cursor to skip over to the next tab stop
\\ = backslash = causes a backslash to be printed so to get one you type 2
\" = causes a double quotation mark to be printed


 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#"); //after this \n sequence anything written will be under the new line
        System.out.println("Hello dunyali \nhow are you today? \nIt's nice to see you");
        System.out.println("Deneme \\bir iki \"bu ne\"");
        System.out.println("deniyorum bir kere \tdaha");
        System.err.println("Kodcu Huseyin");
        System.out.println("\t evet iste simdi oldu basskan");
        System.out.println("\t========\n\"----\"");
        System.out.println("tatava yapma \"BABA YORGUN\"");

    }


}
