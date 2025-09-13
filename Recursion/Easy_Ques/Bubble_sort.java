package Recursion.Easy_Ques;

import java.util.Arrays;

public class Bubble_sort {
    
    static void sort(int[] arr,int r, int c) {
        if (r==0) {
            return;
        }
        if (c<r) {
            if (arr[c+1]<arr[c]) {
                int temp = arr[c+1];
                arr[c+1]= arr[c];
                arr[c]= temp;
            }
            sort(arr, r, c+1);
        }
        else {
            sort(arr, r-1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,6,3};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
