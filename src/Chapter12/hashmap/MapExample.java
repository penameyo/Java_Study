package Chapter12.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("key1 = ", 1);
        hashmap.put("key2 = ", 2);
        hashmap.put("key3 = ", 3);
        hashmap.put("key4 = ", 4);
        System.out.println(hashmap);

        boolean isContains = hashmap.containsKey("Key가 없는데요?");
        System.out.println("isContains= "+isContains);
        boolean containsValue = hashmap.containsValue(3);
        System.out.println("containsValue = "+containsValue);

        Set<String> keyset = hashmap.keySet();
        System.out.println(keyset);
    }
}
