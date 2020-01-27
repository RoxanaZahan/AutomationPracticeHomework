package DataTypesPackage;

import DataTypesPackage.Enums.FavouriteFruits;

public class Main {
    public static void main(String[] args) {
        Strings dataTypes = new Strings();
        FavouriteFruits favouriteFruits = new FavouriteFruits();
        MapsAndHashMaps mapsAndHashMaps = new MapsAndHashMaps();

        System.out.println("\n1. Strings exercises:");
        //    Given a string and a second "word" string, we'll say that the word matches the string if
        //    it appears at the front of the string, except its first char does not need to match exactly.
        //    On a match, return the front of the string, or otherwise return the empty string. So,
        //    so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        //    startWord("hippo", "hi") → "hi"
        //    startWord("hippo", "xip") → "hip"
        //    startWord("hippo", "i") → "h"
        System.out.println(dataTypes.startWord("yolka", "o"));

        //    Given two strings, append them together (known as "concatenation") and return the result.
        //    However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        //    conCat("abc", "cat") → "abcat"
        //    conCat("dog", "cat") → "dogcat"
        //    conCat("abc", "") → "abc"
        System.out.println(dataTypes.concatStrings("abc", "cba"));

        System.out.println("\n2. Enum exercises:");
        //    Enum - Create package - 2 classes (1 Class, 1 Enum)
        //    In enum, create 5 values with 2 values each
        //    In class, - add all enums (values) to a list and print them, from top to bottom and from bottom to top
        favouriteFruits.getMyFruits(); //adds items to list from enum (Enums.Fruits)
        favouriteFruits.printMyFruitsTopBottom();
        favouriteFruits.printMyFruitsBottomTop();

        System.out.println("\n3. Maps exercises:");

        //    https://codingbat.com/prob/p197888
        //    Modify and return the given map as follows: if the key "a" has a value,
        //    set the key "b" to have that value, and set the key "a" to have the value "".
        //    Basically "b" is a bully, taking the value and replacing it with the empty string.
        //      ex:
        //    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        //    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        //    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
        mapsAndHashMaps.addItemsToMyMap("a", "tree");
        mapsAndHashMaps.addItemsToMyMap("b", "star");
        mapsAndHashMaps.addItemsToMyMap("c", "moon");
        mapsAndHashMaps.mapBully();

        //    https://codingbat.com/prob/p117630
        //    The classic word-count algorithm: given an array of strings, return a Map<String,
        //    Integer> with a key for each different string,
        //    with the value the number of times that string appears in the array.
        //      ex:
        //    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        //    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        //    wordCount(["c", "c", "c", "c"]) → {"c": 4}
        System.out.println(mapsAndHashMaps.getMyHashMap());
        System.out.println(mapsAndHashMaps.getMyArrayHashmap());

    }
}
