package DataTypesPackage;
import java.util.HashMap;

public class MapsAndHashMaps {

    HashMap<String, String> myHashMap = new HashMap<>();

    public void addItemsToMyMap(String key, String value) {
        myHashMap.put(key, value);
    }

    public void mapBully() {
        if(!myHashMap.get("a").isEmpty()) {
            myHashMap.replace("b", myHashMap.get("a"));
            myHashMap.replace("a", "");
        }
    }

    public HashMap getMyHashMap() {
        return myHashMap;
    }

    String[] myArray = {"a", "b", "a", "c", "b"};
    HashMap<String, Integer> myArrayHashMap = new HashMap<>();

    public HashMap getMyArrayHashMap() {
        for(String key : myArray) {
            if(myArrayHashMap.containsKey(key)) {
                myArrayHashMap.put(key, myArrayHashMap.get(key) + 1);
            } else {
                myArrayHashMap.put(key, 1);
            }
        }
        return myArrayHashMap;
    }
}
