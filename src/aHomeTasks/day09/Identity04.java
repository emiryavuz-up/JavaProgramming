package aHomeTasks.day09;

public class Identity04 {

    public static void main(String[] args) {


        char ch = '@';
        String result = "";

        if (ch >= '0' && ch <= '9') {
            result = "Digit";
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            result = "Alphabetic Characters";
        } else{
            result = "Special Characters";
        }
    }
}