package Leetcode;

public class leetcode_169 {
    // public int majorityElement(int[] nums) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }
    // for (Integer key : map.keySet()) {
    // if (map.get(key) > nums.length / 2) {
    // return key;
    // }
    // }
    // return -1;
    // }

    // main optimal solution Boyre-moore votiing algorithm
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                n = nums[i];
                count++;
            }
        }
        return n;
    }

}
