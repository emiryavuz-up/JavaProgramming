package aHomeTasks.aInterviewQuestions;

import java.util.ArrayList;

public class blogDb {

    // blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database,
    // Each row from the database table is represented by a position in the ArrayList.
    // Each ArrayList position holds a string array that holds the row data. the database table columns are : id(string),title(string), content(string).
    // The String id argument of blogDb method is referring to a row from the table the arraylist holds.
    // You need to loop through each element in the ArrayList and find the matching String[] with that id.
    // Then return the title and content in format below.EX : blogDb(r,"1") -->title...content1

    public static String blogDb(ArrayList<String[]> r, String id){

        // row represents each value that arraylist holds
        for (String[] row : r) {

            // if the first value of arraylist equals the given id
            if(row[0].equalsIgnoreCase(id)){
                return row[1] + "..." + row[2];
            }
        }
        return "Not found";
    }

    public static void main(String[] args) {

        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"1", "first title", "content of the first row"});
        data.add(new String[]{"2", "second title", "content of the second row"});
        data.add(new String[]{"3", "third title", "content of the third row"});

        System.out.println(blogDb(data, "1"));

    }

}
