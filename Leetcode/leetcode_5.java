package Leetcode;

public class leetcode_5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            int l = Math.max(len1, len2);
            if (l > end - start) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }
        return s.substring(start, end);
    }

    public int expand(String s, int left, int right) {
        if (left >= 0 && right < s.length() & s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
