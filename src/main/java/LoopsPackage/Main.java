package LoopsPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Loops loops = new Loops();
        ArrayList<Integer> myNumbersList1 = new ArrayList<Integer>();

        myNumbersList1.add(1);
        myNumbersList1.add(3);
        myNumbersList1.add(2);
        myNumbersList1.add(4);

        ArrayList<Integer> myNumbersList2 = new ArrayList<Integer>();

        myNumbersList2.add(1);
        myNumbersList2.add(3);
        myNumbersList2.add(2);
        myNumbersList2.add(4);
        myNumbersList2.add(3);
        myNumbersList2.add(5);
        myNumbersList2.add(4);
        myNumbersList2.add(1);

        //    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
        //    immediately followed by a 4. Do not move the 3's, but every other number may move.
        //    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears
        //    in the array before any 4.
        System.out.println("\nExercise 1:");
        System.out.println(loops.getMutantList1(myNumbersList1));
        System.out.println(loops.getMutantList1(myNumbersList2));
        System.out.println("\n- with Collections: ");
        System.out.println(loops.getMutantList2(myNumbersList1));
        System.out.println(loops.getMutantList2(myNumbersList2));

        // Write a Java program to replace every element with the next smallest element (from right side) in a given array of integers.
        int[] myIntArray = {3, 2, 4, 3, 2, 4, 1};
        System.out.println("\nExercise 2:");
        System.out.println(Arrays.toString(loops.rearrangeArray(myIntArray)));
    }
}
