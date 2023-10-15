package aHomeTasks.day27;

public class UpperCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        int count1 = 0;
        int count2 = 0;

        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                count1++;
            }else if(Character.isLowerCase(each)){
                count2++;
            }

        }

        boolean isEqual = count1 == count2;

        System.out.println(isEqual);

    }

}

/*
4. Write program that returns true if the total number of upper case characters
    are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */
