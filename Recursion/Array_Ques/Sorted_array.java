package Recursion.Array_Ques;

public class Sorted_array {
    
    static boolean sorted(int[] arr, int i) {
        if (i==arr.length-1) {
            return true;
        }
        return arr[i+1]>arr[i] &&  sorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7};
        System.out.println(sorted(arr,0));
    }
}
