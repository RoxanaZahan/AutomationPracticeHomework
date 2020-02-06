package DataTypesPackage.Enums;

import java.util.ArrayList;

public class FavouriteFruits {

    ArrayList<String> myFruits = new ArrayList<String>();

    public ArrayList getMyFruits() {
        for (Fruits fruit : Fruits.values()) {
            myFruits.add(fruit.toString());
            myFruits.add(fruit.getType1());
            myFruits.add(fruit.getType2());
        }
        return myFruits;
    }

    public void printMyFruitsTopBottom() {
        System.out.println("\nTop - Bottom print:");
        for(int i = 0; i<myFruits.size(); i+=3) {
            System.out.println(myFruits.get(i) + ": " + myFruits.get(i+1) + ", " + myFruits.get(i+2));
        }
    }

    public void printMyFruitsBottomTop() {
        System.out.println("\nBottom - Top print:");
        for(int i = myFruits.size()-3; i>-1; i-=3) {
            System.out.println(myFruits.get(i) + ": " + myFruits.get(i+1) + ", " + myFruits.get(i+2));
        }
    }
}
