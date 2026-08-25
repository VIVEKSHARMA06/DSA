package Leetcode;

// import java.util.Arrays;

public class leetcode_238 {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int prod = 1;
        prefix[0] = 1;
        for (int i = 1; i < length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = length - 1; i >= 0; i--) {
            prefix[i] = prefix[i] * prod;
            prod*=nums[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        // int[] arr =
        productExceptSelf(new int[] { 1, 2, 3, 4 });
    }
}
