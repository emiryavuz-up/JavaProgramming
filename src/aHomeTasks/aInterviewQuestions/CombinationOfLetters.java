package aHomeTasks.aInterviewQuestions;

import java.util.ArrayList;

public class CombinationOfLetters {
    public static void main(String[] args) {

        // 2.Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
        // The combinations should be displayed in descending alphabetical order://EX : zz zy zx zw zv yz .... vv

        String[] letters = {"z", "y", "x", "w", "v"};

        for (String firstLetter : letters) {

            for (String secondLetter : letters) {

                System.out.print(firstLetter + secondLetter + "...");

            }

        }


    }

}




/*
//1.Write a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence,
otherwise return false.EX : appearsTwice("java", "java is fun!") - returns false

//2.Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order://EX : zz zy zx zw zv yz .... vv
//3. blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database, each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data. the database table columns are : id(string),title(string), content(string).
//ArrayList<String[]> r example. Each item in ArrayList is a String ArrayList r = [["1","title","content1"],   ["2","another title","content2"],//["3","yet another title","content3"]]
//the String id argument of blogDb method is referring to a row from the table the arraylist holds.You need to loop through each element in the ArrayList and find the matching String[] with that id.Then return the title and content in format below.EX : blogDb(r,"1") -->title...content1
//4.Write a method reverseVowels() that will return a string with reversed vowels.Input:str = "apple" --> Output:  str = "eppla"
//5.The method printList accepts an ArrayList of ArrayLists and returns it as a string.Method concatenates all values from each ArrayList and returns it as one. EX : printList([["a",b],["c",d]]) --> "abcd"
//6.Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.EX : {{1,1,2}, //4 {3,1,2}, //6 {3,5,3}, //11  {0,1,2}  //3 } --->u get array back:   {4,6,11,3}
//7.A 2D array is considered "magic" if the following are true: The array is square (N rows and N columns).The sums of each row, the sums of each column, and the sums of each diagonal are all equal.Complete the isMagic method so that it will determine whether a given array is magic.
//EX : int[][] a = { //          {1,1,1},
//          {1,1,1},//          {1,1,1}
//       };
//       System.out.println(isMagic(a)); //true
   //int[][] b = {
//          {1,1,2},//          {3,2,3},
//          {1,4,1}//       };
//       System.out.println(isMagic(b)); //false
   //8.Write a method to Switch the last element in an array with the first and return the array. EX : doSwitch([1,2,3,4]) --> [[4,2,3,1]
//9.Complete the sumColumn method so that given a 2-D int array and an integer representing the column to sum, sum up the all elements in that column in the given array.
// EX :int[][] a = {
//          {-5,-2,-3,7},//          {1,-5,-2,2},
//          {1,-2,3,-4}//       };
//    System.out.println(sumColumn(a,1)); //should print -9
//10.Complete the minVowels method so that given the array words, it will return the word with the least number of vowels - if there are two or more words with the same number of vowels, it should return the shortest word.You may find it helpful to write a helper method called countVowels that uses an accumulator algorithm to count the vowels.//EX : String[] arr = {"hey","yolo","hi","this is long"};
   //System.out.println(minVowels(arr));   //should print "hi"
 */
