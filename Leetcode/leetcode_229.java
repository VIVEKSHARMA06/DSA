package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_229 {

    // time complexity: O(n)
    // space complexity: O(n)
    // public List<Integer> majorityElement(int[] nums) {
    // List<Integer> ans = new ArrayList<>();
    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }

    // for (Integer i : map.keySet()) {
    // if (map.get(i) > nums.length / 3) {
    // ans.add(i);
    // }
    // }

    // return ans;
    // }

    // time complexity: O(n)
    // space complexity: O(1)
    // Boyre moore voting algorithm
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n1 = 0;
        int n2 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n1) {
                c1++;
            } else if (nums[i] == n2) {
                c2++;
            } else if (c1 == 0) {
                c1 = 1;
                n1 = nums[i];
            } else if (c2 == 0) {
                c2 = 1;
                n2 = nums[i];
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n1) {
                c1++;
            } else if (nums[i] == n2) {
                c2++;
            }
        }
        if (c1 > nums.length / 3)
            ans.add(n1);

        if (c2 > nums.length / 3)
            ans.add(n2);

        return ans;
    }
}
