package ArraysAndCollectionsPackage;

import java.util.ArrayList;
import java.util.Random;

public class ArraysAndCollections {

    //https://codingbat.com/prob/p117665
//    Given a list of integers, return a list where each integer is multiplied by 2.
//    doubling([1, 2, 3]) → [2, 4, 6]
//    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
//    doubling([]) → []

    public ArrayList<Integer> doubleTheNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++) {
            newList.add(nums.get(i) * 2);
        }
        return newList;
    }

    //https://codingbat.com/prob/p181634
//    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
//    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
//    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
//    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

    public ArrayList<String> concatenatedCopies(ArrayList<String> strings) {
        ArrayList<String> newList = new ArrayList<>();
        for(String e : strings) {
            String newString = "";
            int z = 3;
            while(z>0) {
                newString += e;
                z--;
            }
            newList.add(newString);
        }
        return newList;
    }

    //https://codingbat.com/prob/p152194
//    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
//    rightDigit([1, 22, 93]) → [1, 2, 3]
//    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
//    rightDigit([10, 0]) → [0, 0]

    public ArrayList<Integer> getRightDigits(ArrayList<Integer> nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i : nums) {
            newList.add(i%10);
        }
        return newList;
    }

    //https://codingbat.com/prob/p194496
//    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
//    noLong(["this", "not", "too", "long"]) → ["not", "too"]
//    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
//    noLong(["cccc", "cccc", "cccc"]) → []

    public ArrayList<String> getShortWords(ArrayList<String> strings) {
        ArrayList<String> newList = new ArrayList<>();
        for(String i : strings) {
            if(i.length()<4) {
                newList.add(i);
            }
        }
        return newList;
    }

    //https://codingbat.com/prob/p148198
//    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
//    two2([1, 2, 3]) → [4, 6]
//    two2([2, 6, 11]) → [4]
//    two2([0]) → [0]

    public ArrayList<Integer> multiplyBy2Ignore2(ArrayList<Integer> nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i : nums) {
            int x = i * 2;
            if((x % 10) != 2) {
                newList.add(x);
            }
        }
        return newList;
    }

//  Build a program that uses Random to choose and item from a list. The chosen item should be the first choice that is a duplicate.

    public String chooseItem(ArrayList<String> myList) {
        Random random = new Random();
        ArrayList<String> choices = new ArrayList<>();
        String response = "";
        int i = 1;
        while(i <= myList.size() + 1) {
            int randomItem = random.nextInt(myList.size());
            String randomElement = myList.get(randomItem);
            System.out.println("Attempt " + i + ": " + randomElement);
            i++;
            if(choices.contains(randomElement)){
                response = randomElement;
                break;
            }
            choices.add(randomElement);
        }
        return "The chosen item is: " + response;
    }
}
