package Leetcode;

public class leetcode_540 {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(mid%2!=0) {
                if(nums[mid]==mid+1) {
                    end=mid-1;
                }
                else if (nums[mid]==nums[mid-1]){
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
            else{
                if(nums[mid]==mid-1) {
                    end=mid-1;
                }
                else if (nums[mid]==nums[mid+1]){
                    start=mid+2;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
