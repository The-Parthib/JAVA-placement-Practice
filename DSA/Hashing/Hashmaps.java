package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple", 24);
        map.put("bananan", 37);       
        map.put("lemon", 2);
        // map.remove("lemon"); // to remove values
        int size = map.size();
        System.out.println(size);
        System.out.println(map);
        map.put("apple", 150); // if we use same key values then it changes the older value to new value
        System.out.println(map);

        if (map.containsKey("apple")) {
            System.out.println("Apple is present in the map "+map.get("apple"));
        }

        System.out.println(map.get("apple"));
        System.out.println(map.get("jhik"));

        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }

        Set<String> key = map.keySet();
        for (String e : key) {
            System.out.println(e+" "+map.get(e));
        }
    }
}