package Leetcode;

public class leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(ans.toString())) {
                ans = ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }
}
