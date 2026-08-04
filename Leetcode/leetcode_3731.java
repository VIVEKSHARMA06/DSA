package Leetcode;

import java.util.*;

public class leetcode_3731 {
    // public List<Integer> findMissingElements(int[] nums) {
    // ArrayList<Integer> arr = new ArrayList<>();
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length - 1; i++) {
    // if (nums[i] != nums[i + 1]) {
    // int x = nums[i] + 1;
    // while (x != nums[i + 1]) {
    // arr.add(x);
    // x++;
    // }
    // }
    // }
    // return arr;
    // }

    // second approach
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            set.add(n);
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                arr.add(i);
            }
        }
        return arr;
    }
}
