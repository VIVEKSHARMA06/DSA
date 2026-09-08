package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_438 {
    // my solution
    // O(n x m)
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[26];
        for (int i = 0; i <= s.length() - p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                arr[s.charAt(i + j) - 'a']++;
                arr[p.charAt(j) - 'a']--;
            }
            boolean isAnagram = true;
            for (int j = 0; j < p.length(); j++) {
                if (arr[p.charAt(j) - 'a'] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            Arrays.fill(arr, 0);
            if (isAnagram) {
                ans.add(i);
            }
        }
        return ans;
    }

    // optimal
    // O(n)
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> ans = new ArrayList<>();

            if (s.length() < p.length()) {
                return ans;
            }

            int[] pFreq = new int[26];
            int[] windowFreq = new int[26];

            for (char c : p.toCharArray()) {
                pFreq[c - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {

                windowFreq[s.charAt(i) - 'a']++;

                if (i >= p.length()) {
                    windowFreq[s.charAt(i - p.length()) - 'a']--;
                }

                if (i >= p.length() - 1 && Arrays.equals(pFreq, windowFreq)) {
                    ans.add(i - p.length() + 1);
                }
            }

            return ans;
        }
    }
}
