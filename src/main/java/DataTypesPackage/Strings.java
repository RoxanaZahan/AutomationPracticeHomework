package DataTypesPackage;

public class Strings {

    public String startWord(String string, String word) {
        String startWord = "";
        if(string.substring(0,word.length()).equals(word) || string.substring(1,word.length()).equals(word.substring(1))) {
            startWord = string.substring(0,word.length());
        }
        return startWord;
    }

    public String concatStrings(String a, String b) {
        String finalString = "";
        if(a.charAt(a.length()-1) == b.charAt(0)) {
            finalString = a + b.substring(1);
        } else {
            finalString = a + b;
        }
        return finalString;
    }
}
