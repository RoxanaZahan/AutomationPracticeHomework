package LoopsPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Loops {


//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
//    immediately followed by a 4. Do not move the 3's, but every other number may move.
//    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears
//    in the array before any 4.
//
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
    //[1, 3, 4, 2, 3, 5, 4, 1]
    //&& myList.indexOf(e) > myList.indexOf(i)

    public ArrayList getMutantList1(ArrayList<Integer> myList) {
        for(int i : myList) {
            if(i == 3 && myList.indexOf(i)+1 != 4) {
                //ArrayList<Integer> mySublist = new ArrayList<>(myList.subList(myList.indexOf(i)+1, myList.size()));
                for(int e : myList) {
                    if (e == 4 && myList.indexOf(e)-1 != 3) {
                        int toMove = myList.get(myList.indexOf(i)+1);
                        System.out.println(toMove);
                        int index = myList.indexOf(e);
                        System.out.println(index);
                        myList.set(myList.indexOf(i)+1, e);
                        myList.set(index, toMove);
                        break;
                    }
                }
            }
            //System.out.println(myList.subList(myList.indexOf(i)+1, myList.size()));
            System.out.println(myList);
        }
        return myList;
    }

    //Use Collections
    public ArrayList getMutantList2(ArrayList<Integer> myList) {
        for(int i : myList) {
            if(i == 3) {
                for(int e : myList) {
                    if(e == 4) {
                        Collections.swap(myList,myList.indexOf(i)+1, myList.indexOf(e));
                    }
                }
            }
        }
        return myList;
    }

    // Write a Java program to replace every element with the next smallest element (from right side) in a given array of integers.
    int[] myIntArray = {3, 2, 4, 3, 2, 4, 1};

    public int[] rearrangeArray(int[] myIntArray) {
        for(int i : myIntArray) {
            for(int e: myIntArray) {
                if((findIndex(myIntArray,e) > findIndex(myIntArray,i)) && (i > e)) {
                    int y = i; //to store i value
                    int x = e; // to store e value
                    int f = findIndex(myIntArray,e);
                    myIntArray[findIndex(myIntArray,i)] = x;
                    myIntArray[f] = y;
                }
            }
        }
        for(int z : myIntArray) {
            System.out.print(z);
        }
        return myIntArray;
    }

    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
