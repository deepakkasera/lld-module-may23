package collections2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();
        //LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("India");
        set.add("US");
        set.add("UAE");
        set.add("Australia");
        set.add("Japan");
        linkedHashSetDemo(set);
    }

    private static void linkedHashSetDemo(Set<String> set) {
        for (String key : set) {
            System.out.print(key + ", ");
        }
    }
}
