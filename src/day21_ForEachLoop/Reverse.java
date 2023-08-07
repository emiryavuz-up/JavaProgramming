package day21_ForEachLoop;

public class Reverse {

    public static void main(String[] args) {

        String[] names = {"Koca Kafa", "Kucuk Limon", "Minik Jager", "Prenses Maya", "ASD BASD", "DAA BAA"};

        for (String each : names) { // each: Koca Kafa, Kucuk Limon, Minik Jager...

            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) { // start from last character of the "each", go to 0
                reversed += each.charAt(i); // each character in reverse order assigned to reversed string
            }

            System.out.println(reversed);

        }

    }

}
