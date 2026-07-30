package Leetcode;

import java.util.*;

public class leetcode_496 {

    // time optimized solution
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }

    // space optimized without using stack
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[nums2.length - 1]) {
                ans[i] = -1;
                continue;
            }
            boolean found = false;
            boolean added = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true;
                    continue;
                }
                if (found && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    added = true;
                    break;
                }
            }
            if (!added) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
