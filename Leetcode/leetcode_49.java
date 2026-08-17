package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode_49 {
    // public List<List<String>> groupAnagrams(String[] strs) {
    // ArrayList<String> arr = new ArrayList<>(Arrays.asList(strs));
    // int x = -1;
    // List<List<String>> ans = new ArrayList<>();
    // while (!arr.isEmpty()) {
    // String str = arr.remove(0);
    // ans.add(new ArrayList<>(Arrays.asList(str)));
    // x++;
    // int i = 0;
    // while (i < arr.size()) {
    // if (isAnagram(str, arr.get(i))) {
    // ans.get(x).add(arr.get(i));
    // arr.remove(i);
    // continue;
    // }
    // i++;
    // }
    // }
    // return ans;
    // }

    // public boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // int[] count = new int[26];

    // for (int i = 0; i < s.length(); i++) {
    // count[s.charAt(i) - 'a']++;
    // }

    // for (int i = 0; i < t.length(); i++) {
    // if (count[t.charAt(i) - 'a'] == 0)
    // return false;

    // count[t.charAt(i) - 'a']--;
    // }

    // return true;
    // }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(strs[i]);
            } else {
                map.put(sorted, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        return new ArrayList<>(map.values());
    }
}
