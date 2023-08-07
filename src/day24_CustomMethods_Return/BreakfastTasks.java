package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("smyrna", "simushy");

        System.out.println("-------------------------");

        domain("Smyrna@gmail.com");

        System.out.println("------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Smyrna@kocakafa.com", "Kocakafa@smyrna.com"};

        domain(emails[0]);

        for (String email : emails) {
            domain(email); // each of the mail will be functioned through domain
            System.out.println(email);
        }

        System.out.println("-----------------------------------");

        nameOfTheMonth(14);

        System.out.println("-----------------------------------");

        nameOfTheDay(3);

        System.out.println("--------------------------------------");

        daysInMonth(5);

    }






    // 1. Create a method that can display the initials of the person. initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName){

     // function of the method because it's in the body. it will do what here says

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        initial = initial.toUpperCase(); // initials will be in upperCase

        System.out.println(initial);


    }

    // 2. Create a method that can display the domain of the email // domain(String email)
                                                                            //parameter and it's name

    public static void domain(String email){ // Smyrna@gmail.com

    String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println(domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfTheMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number == 1)? "January" : (number == 2)? "February" :
                    (number == 3)? "March" : (number == 4)? "April" :
                            (number == 5)? "May" : (number == 6)? "June" :
                                    (number == 7)? "July" : (number == 8)? "August" :
                                            (number == 9)? "September" : (number == 10)? "October" :
                                                    (number == 11)? "November" : "December";


        }else{
            name = "Invalid";
        }

        System.out.println("Month Name: " + name);

    }

    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfTheDay(int number){

        String name = "";

        if(number >= 1 && number <= 7){

           name = (number == 1)? "Monday" : (number == 2)? "Tuesday" : (number == 3)? "Wednesday" :
                    (number == 4)? "Thursday" : (number == 5)? "Friday" :
                            (number == 6)? "Saturday" : "Sunday";

        }else{
            name = "Invalid";
        }

        System.out.println(name);

    }

    // 	5. Create a method that can print how many days a month has

    public static void daysInMonth (int number){

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number == 1)? "30" : (number == 2)? "30" : (number == 3)? "28" : (number == 4)? "30" :
                    (number == 5)? "29" : (number == 6)? "30" : (number == 7)? "28" : (number == 8)? "31" :
                            (number == 9)? "30" : (number == 10)? "31" : (number == 11)? "30" : "29";

        }else{
            name = "Invalid";
        }

        System.out.println(name);

    }



}

/*

Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */