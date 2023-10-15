package aHomeTasks.day19;

public class FirstDuplicate02 {


    public static void main(String[] args) {
        String input = "zzsaatbb";
        char firstDuplicate = '\0';

        for (int i = 0; i < input.length(); i++) { // infinite loop
            char currentChar = input.charAt(i);

            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    firstDuplicate = currentChar;
                    break;
                }
            }

            if (firstDuplicate != '\0') {
                break; // outer loop u kapatan kod
            }
        }

        if (firstDuplicate != '\0') {
            System.out.println("First duplicate amk: " + firstDuplicate);
        } else {
            System.out.println("Nie duplicate characters amk.");
        }







    }
}
