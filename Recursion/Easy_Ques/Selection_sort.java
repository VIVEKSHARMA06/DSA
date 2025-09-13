package Recursion.Easy_Ques;

import java.util.Arrays;

public class Selection_sort {

    static void sort(int[] arr,int r, int c, int max) {
        if (r==0) {
            return;
        }
        if (c<=r) {
            if (arr[max]<arr[c]) {
                max=c;
            }
            sort(arr, r, c+1, max);
        }
        else {
            int temp = arr[max];
            arr[max]= arr[r];
            arr[r]= temp;
            sort(arr, r-1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,6,3};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
