package aHomeTask.day19;

public class FirstDuplicate03 {

    public static void main(String[] args) {

        String word = "bcsrdarwraagoekqbbw";
        char firstDuplicate = '\0'; // Initial value for first duplicate character. '\0' is a null character

        // Outer loop goes through each character in the word
        for (int i = 0; i < word.length(); i++) {
            // We get the current character we are checking
            char currentChar = word.charAt(i);

            // We are setting foundDuplicate to false before we start checking for duplicates
            boolean foundDuplicate = false;

            // Inner loop checks all the previous characters before currentChar
            for (int j = 0; j < i; j++) {

                // If we find a duplicate, we set foundDuplicate to true and break the loop
                if (word.charAt(j) == currentChar) {
                    foundDuplicate = true;
                    break;
                }
            }

            // If a duplicate was found, this is the first duplicate character. We store it in firstDuplicate and break the loop
            if (foundDuplicate) {
                firstDuplicate = currentChar;
                break;
            }
        }

        // If we found a first duplicate, we print it. Otherwise, we print that there is no duplicate
        if (firstDuplicate != '\0') {
            System.out.println("First duplicate is: " + firstDuplicate);
        } else {
            System.out.println("No duplicate is found");
        }
    }

    }

/*
1. Write a program that can return the first duplicated character from a string
 */
