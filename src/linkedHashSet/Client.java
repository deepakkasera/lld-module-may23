package linkedHashSet;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

//        for (int value : set) {
//            System.out.println(value);
//        }

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);
        linkedSet.add(60);

        for (int value : linkedSet) {
            System.out.println(value);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 144);
        map.put("China", 142);
        map.put("US", 25);
        map.put("UK", 34);

//        for (Map.Entry<String, Integer> entry :  map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
//
//        for (int value : map.values()) {
//            System.out.println(value);
//        }

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("India", 144);
        linkedHashMap.put("China", 142);
        linkedHashMap.put("US", 25);
        linkedHashMap.put("UK", 34);

        for (Map.Entry<String, Integer> entry :  linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
