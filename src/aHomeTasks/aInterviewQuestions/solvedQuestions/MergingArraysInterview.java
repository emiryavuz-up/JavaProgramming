package aHomeTasks.aInterviewQuestions.solvedQuestions;

import java.util.Arrays;

public class MergingArraysInterview {


    public static void main(String[] args) {


        String[] group1 = {"Ali", "Layan", "Aysenur"}; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; // 5

        String[] students = new String[group1.length + group2.length]; // to make sure students array has enough capacity
                                                                      // to contain all elements of first and second array

        int i = 0; // will represent index numbers of students array // help us track index numbers after storing all the names from 1st to 3rd array
        for (String each : group1) { // gets each word from group 1 array: Ali, Layan, Aysenur
            students[i++] = each; // first pass current value and decrease it ==> by increasing by 1 we add next name to the index
                                    // so i++ helps us add numbers together
        }

        for (String each : group2) { // Maria, Aygun, Duygu, Suat, Valeriy
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length]; // chars should has enough capacity to contain all elements of ch1 and ch2

        int j = 0;

        for (char ch : ch1) { // {'A', 'B', 'C'};
            chars[j] = ch; //
            j++;
        }

        for (char ch : ch2) {
            chars[j] = ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }

}

/*
 write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */
