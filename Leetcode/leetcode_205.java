package Leetcode;

// import java.util.HashMap;

public class leetcode_205 {
    // HashMap
    // public boolean isIsomorphic(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // HashMap<Character, Character> map = new HashMap<>();

    // for (int i = 0; i < s.length(); i++) {
    // if (!map.containsKey(s.charAt(i))) {
    // if (map.containsValue(t.charAt(i))) {
    // return false;
    // } else {
    // map.put(s.charAt(i), t.charAt(i));
    // }
    // }
    // if (map.get(s.charAt(i)) != t.charAt(i)) {
    // return false;
    // } else
    // continue;
    // }

    // return true;
    // }

    // Array optimized
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] map1 = new int[128];
        int[] map2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1[a] != 0 && map1[a] != b)
                return false;

            if (map2[b] != 0 && map2[b] != a)
                return false;

            map1[a] = b;
            map2[b] = a;
        }

        return true;
    }
}
