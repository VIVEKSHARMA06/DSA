package Leetcode;

import java.util.HashSet;

public class leetcode_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

    for(int num : nums){

        if(set.contains(num)){
            return true;
        }

        set.add(num);
    }

    return false;
    }
}
