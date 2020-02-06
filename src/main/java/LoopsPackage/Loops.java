package LoopsPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Loops {

    //https://codingbat.com/prob/p159339
//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
//    immediately followed by a 4. Do not move the 3's, but every other number may move.
//    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears
//    in the array before any 4.
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    //using Arrays - this can be tested in codingbat
    public int[] getMutantArray(int[] myArray) {
        for(int i = 0; i< myArray.length; i++) {
            if(myArray[i] == 3 && myArray[i+1] != 4) {
                for(int e = 0; e < myArray.length; e++) {
                    if (myArray[e] == 4 && myArray[e-1] != 3) {
                        int toMove = myArray[i+1];
                        int index = e;
                        myArray[i+1] = myArray[e];
                        myArray[index] = toMove;
                        break;
                    }
                }
            }
        }
        return myArray;
    }

    //using ArrayList
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

    //Using Collections
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

    //https://codingbat.com/prob/p183562
//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
//    Return true if it is possible to make the goal by choosing from the given bricks.
//    makeBricks(3, 1, 8) → true
//    makeBricks(3, 1, 9) → false
//    makeBricks(3, 2, 10) → true

    //without loops
    public boolean makeBricks(int small, int big, int goal) {
        int wall = 0;
        if(goal % 5 >= 0 && big != 0 && goal/5 >= big) {
            wall += big*5;
        } else if(goal % 5 >= 0 && big != 0) {
            wall += (goal / 5) * 5;
        }
        if(wall<goal && goal-wall <= small) {
            wall += (goal-wall) * 1;
        }
        return wall == goal;
    }

    //with loops
    public boolean makeBricks2(int small, int big, int goal) {
        int wall = 0;
        while(wall < goal && big > 0) {
            wall += 5;
            big --;
            if (wall+5>goal) {
                break;
            }
        }
        while(wall < goal && small > 0) {
            wall += 1;
            small --;
            if (wall+1>goal) {
                break;
            }
        }
        return wall == goal;
    }
}
