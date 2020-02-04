package LoopsPackage;

import java.util.ArrayList;

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

       //System.out.println(loops.getMutantList1(myNumbersList1));
        System.out.println(loops.getMutantList1(myNumbersList2));
        //System.out.println(loops.getMutantList2(myNumbersList1));
        //System.out.println(loops.getMutantList2(myNumbersList2));

        int[] myIntArray = {3, 2, 4, 3, 2, 4, 1};
        //loops.rearrangeArray(myIntArray);
    }
}
