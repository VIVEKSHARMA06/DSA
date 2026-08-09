package Leetcode;

// import java.util.HashMap;

public class leetcode_242 {
    // public boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    // }

    // for (int i = 0; i < t.length(); i++) {
    // if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0)
    // return false;
    // map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
    // }
    // return true;
    // }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i) - 'a'] == 0)
                return false;

            count[t.charAt(i) - 'a']--;
        }

        return true;
    }
}
