package DSA.Hashing;

import java.util.HashMap;

public class Itinenary {
    public static void main(String[] args) {
        HashMap<String,String> tick = new HashMap<>();
        tick.put("chennai", "bengaluru");
        tick.put("mumbai", "delhi");
        tick.put("goa","chennai");
        tick.put("delhi", "goa");

        String start = findStart(tick);
        while (tick.containsKey(start)) {
            System.out.print(start+" -> ");
            start = tick.get(start);
        }
        System.out.println(start);
    }

    public static String findStart(HashMap<String,String> tick){
        HashMap<String,String> rev  = new HashMap<>();
        for (String key : tick.keySet()) {
            rev.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (!rev.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}
