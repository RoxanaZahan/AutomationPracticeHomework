package LoopsPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Loops {

//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
//    immediately followed by a 4. Do not move the 3's, but every other number may move.
//    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears
//    in the array before any 4.
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public ArrayList getMutantList1(ArrayList<Integer> myList) {
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i) == 3) {
                for(int e = i+1; e < myList.size(); e++) {
                    if (myList.get(e) == 4) {
                        int toMove = myList.get(i+1);
                        int index = e;
                        myList.set(i+1, myList.get(e));
                        myList.set(index, toMove);
                        break;
                    }
                }
            }
        }
        return myList;
    }

    //Use Collections
    public ArrayList getMutantList2(ArrayList<Integer> myList) {
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i) == 3) {
                for(int e = i+1; e < myList.size(); e++) {
                    if(myList.get(e) == 4) {
                        Collections.swap(myList,i+1, e);
                        break;
                    }
                }
            }
        }
        return myList;
    }

    // Write a Java program to replace every element with the next smallest element (from right side) in a given array of integers.

    public int[] rearrangeArray(int[] myIntArray) {
        for(int i = 0; i<myIntArray.length; i++) {
            for(int e = i+1; e<myIntArray.length; e++) {
                if(myIntArray[i] > myIntArray[e]) {
                    int x = myIntArray[i];
                    int y = myIntArray[e];
                    myIntArray[i] = y;
                    myIntArray[e] = x;
                }
            }
        }
        return myIntArray;
    }
}
