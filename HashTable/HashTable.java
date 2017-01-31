import java.util.*;
public class HashTable {
    public HashMap<Integer, String> buildMap(String[] elements) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i=0; i<elements.length; i++) {
            map.put(i, elements[i]);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] elements = {"a", "b", "c", "def", "ghi", "a"};
        HashTable test = new HashTable();
        HashMap<Integer, String> map = test.buildMap(elements);
        System.out.println(map);
        System.out.println("get 3: " + map.get(3));
        System.out.println("contains key 3: " + map.containsKey(3));
        System.out.println("contains value 3: " + map.containsValue(3));
        System.out.println("contains value ghi: " + map.containsValue("ghi"));
    }
}