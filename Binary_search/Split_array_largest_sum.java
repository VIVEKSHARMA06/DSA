package Binary_search;
//leetcode 410
public class Split_array_largest_sum {
    //we are given an array and we have to split it into k subarrays such that the maximum sum of these subarrays is minimized.
    //in the subarrays, the max sum of all arrays is taken then out of all the max sums, we have to minimize the maximum sum.
    //the min value of the ans can be the max element of the array and the max value can be the sum of all elements in the array.
    //so we now apply bnary search on the range of the max element to the sum of all elements.
    //now we see the array is divided into how many pieces such that the max sum of the subarrays is not greater than the min value.
    //if the number of pieces is greater than k, then we have to increase the mid value because increasing it will add more elements to the subarray which will reduce the number of pieces. so start=mid+1
    //if the number of pieces is less than or equal to k, then we can reduce the mid value because reducing it will add less elements in the subarray which will increase the number of pieces. so end=mid
    //we repeat this process until start<end, which means we have not yet found the minimized maximum sum of the subarrays.
    //we do this until only 1 range lies , when start=mid=end, then we return the end value which will be the minimized maximum sum of the subarrays.

    static int split(int[] arr,int k) {
        int start = 0, end =0;
        for (int i=0;i<arr.length;i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start<end) {
            int mid = start + (end-start)/2;
            int sum = 0;
            int pieces=1;
            for (int num : arr) {
                if (sum+num>mid) {
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if (pieces > k) {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(split(arr,2));
    }
    
}
