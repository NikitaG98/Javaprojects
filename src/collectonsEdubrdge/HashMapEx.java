package collectonsEdubrdge;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("abc", 1);
        hash.put("abd", 2);
        hash.put("PQR", 2);
        hash.putIfAbsent("zq", 4);
        System.out.println(hash);
        System.out.println(hash.containsValue(1));
        System.out.println(hash.containsKey("abc"));
    }
}

