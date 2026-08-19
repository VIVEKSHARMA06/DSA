package Leetcode;

import javax.management.MBeanRegistration;

public class leetcode_42 {

    // time: O(n)
    // space: O(n)
    // public int trap(int[] height) {
    // int[] leftMax = new int[height.length];
    // leftMax[0] = height[0];
    // int water = 0;

    // for (int i = 1; i < leftMax.length; i++) {
    // leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    // }
    // int rightMax = height[height.length - 1];
    // for (int i = leftMax.length - 2; i > 0; i--) {
    // rightMax = Math.max(rightMax, height[i]);
    // water += (Math.min(rightMax, leftMax[i]) - height[i]);
    // }
    // return water;
    // }

    public int trap(int[] height) {
        int left = 1;
        int right = height.length-2;
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        int water=0;

        while (left < right) {
            leftMax=Math.max(height[left],leftMax);
            rightMax=Math.max(height[right],rightMax);

            if (leftMax<rightMax){
                water+=leftMax-height[left];
                left++;
            }
            else{
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
