package ArraysAndCollectionsPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArraysAndCollections arraysAndCollections = new ArraysAndCollections();

        ArrayList<Integer> myNumbersList = new ArrayList<>();
        myNumbersList.add(2);
        myNumbersList.add(5);
        myNumbersList.add(43);
        myNumbersList.add(81);
        myNumbersList.add(34);

        ArrayList<String> myStringsList = new ArrayList<String >();
        myStringsList.add("Coffee");
        myStringsList.add("Tea");
        myStringsList.add("Juice");
        myStringsList.add("Beer");
        myStringsList.add("Wine");

        System.out.println("Exercise 1:");
        System.out.println(arraysAndCollections.doubleTheNumbers(myNumbersList));
        System.out.println("\nExercise 2:");
        System.out.println(arraysAndCollections.concatenatedCopies(myStringsList));
        System.out.println("\nExercise 3:");
        System.out.println(arraysAndCollections.getRightDigits(myNumbersList));
        System.out.println("\nExercise 4:");
        System.out.println(arraysAndCollections.getShortWords(myStringsList));
        System.out.println("\nExercise 5:");
        System.out.println(arraysAndCollections.multiplyBy2Ignore2(myNumbersList));
        System.out.println("\nExercise 6:");
        System.out.println(arraysAndCollections.chooseItem(myStringsList));
    }
}
