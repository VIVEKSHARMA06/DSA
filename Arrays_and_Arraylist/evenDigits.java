//leetcode 1295
package Arrays_and_Arraylist;
public class evenDigits {
    public static  int findNumbers(int[] nums) {
        if (nums.length==0) return 0;
        int count = 0;
        for (int num: nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isEven(int num) {
        if (num==0) return false;
        return ((((int)Math.log10(num)) + 1)%2==0);
    } 
    public static void main(String[] args) {
        int [] nums = {213,52,0,2313,4325,341,542,5};
        int digits=findNumbers(nums);
        System.out.println("total numbers that are even are :"+digits);
    }
} 