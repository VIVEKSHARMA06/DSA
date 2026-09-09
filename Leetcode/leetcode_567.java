package Leetcode;

import java.util.Arrays;

public class leetcode_567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] window = new int[26];

        // freq of string to match
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // initial window frequency
        for (int i = 0; i < s1.length(); i++) {
            window[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(window, freq)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            window[s2.charAt(i - s1.length()) - 'a']--;
            window[s2.charAt(i) - 'a']++;
            if (Arrays.equals(window, freq)) {
                return true;
            }
        }
        return false;
    }
}
