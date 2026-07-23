package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode_128 {
    //brute force
    // public static int longestConsecutive(int[] nums) {
    //     if(nums.length<=1) return nums.length;
    //     Arrays.sort(nums);
    //     int counter = 1,max = 1;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] == nums[i + 1]) {
    //             continue;
    //         }
    //         if (nums[i] + 1 == nums[i + 1]) {
    //             counter++;
    //         } else {
    //             counter = 1;
    //         }
    //         max = Math.max(max, counter);
    //     }
    //     return max;
    // }


//------------------------------------------------------------------------------------------

    // In this approach i have used a Hashmap. pehle humne array ke sare elements ko hashmap me dal diya. phir humne har element ke liye check kiya ki kya ye element already visited(1) hai ya nahi(0). first ham left side me check karenge ki kya ye element ka left side me consecutive element hai ya nahi. agar hai to hum usko visit karenge aur counter ko increment karenge. phir hum right side me check karenge ki kya ye element ka right side me consecutive element hai ya nahi. agar hai to hum usko visit karenge aur counter ko increment karenge. phir hum max ko update karenge. is process ko hum har element ke liye repeat karenge.

    //My solution
    // public static int longestConsecutive(int[] nums) {

    //     int counter=1,max=1;

    //     if (nums.length<=1) {
    //         return nums.length;
    //     }

    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     for (int i=0;i<nums.length;i++) {
    //         map.put(nums[i],0);
    //     }


    //     for (int i=0; i<nums.length; i++) {
    //         if(map.get(nums[i])==1) {
    //             continue;
    //         }
    //         else {
    //             map.put(nums[i], 1);
    //             int num = nums[i]-1;
    //             while(map.containsKey(num)) {
    //                 if(map.get(num)==1) {
    //                     break;
    //                 }
    //                 else {
    //                     map.put(num, 1);
    //                     num--;
    //                     counter++;
    //                     if(max<counter) {
    //                         max=counter;
    //                     }
    //                 }
    //             }
    //             num=nums[i]+1;
    //             while(map.containsKey(num)) {
    //                 if(map.get(num)==1) {
    //                     break;
    //                 }
    //                 else {
    //                     map.put(num, 1);
    //                     num++;
    //                     counter++;
    //                     if(max<counter) {
    //                         max=counter;
    //                     }
    //                 }
    //             }
    //             counter=1;
    //         }
    //     }
    //     return max;
    // }



    // is approach me humne array ke sare elements ko HashSet me dal diya. phir humne har element ke liye check kiya ki kya ye element sequence ka start hai ya nahi. agar ye element sequence ka start hai to hum uske right side me consecutive elements ko check karenge aur counter ko increment karenge. phir hum max ko update karenge. is process ko hum har element ke liye repeat karenge.
        public static int longestConsecutive(int[] nums) {

            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num);
            }

            int max = 0;

            for (int num : set) {

                // Only start if this is the first number of a sequence
                if (!set.contains(num - 1)) {

                    int current = num;
                    int length = 1;

                    while (set.contains(current + 1)) {
                        current++;
                        length++;
                    }

                    max = Math.max(max, length);
                }
            }

            return max;
        }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
