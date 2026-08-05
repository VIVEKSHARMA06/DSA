package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_60 {

    // brute recursive
    // int curr = 0;
    // String ans = "";

    // public String getPermutation(int n, int k) {
    // String s = "";
    // for (int i = 1; i <= n; i++) {
    // s += "" + i;
    // }
    // rec("", s, k);
    // return ans;
    // }

    // public void rec(String p, String up, int k) {
    // if (!ans.isEmpty()) {
    // return;
    // }
    // if (up.isEmpty()) {
    // curr++;
    // if (curr == k) {
    // ans = p;
    // return;
    // }
    // }
    // for (int i = 0; i < up.length(); i++) {
    // rec(p + up.charAt(i), up.substring(0, i) + up.substring(i + 1), k);
    // }
    // }

    // Math optimal
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
            nums.add(i);
        }
        nums.add(n);

        k--;

        StringBuilder ans = new StringBuilder();

        while (true) {
            ans.append(nums.get(k / fact));
            nums.remove(k / fact);

            if (nums.isEmpty()) {
                break;
            }

            k %= fact;
            fact /= nums.size();
        }

        return ans.toString();
    }
}
