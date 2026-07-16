package Sorting.Cyclic_Sort;

import java.util.Arrays;

public class Code {
    //numbers are from 1 to n
    //if the number arr[i] is at i-1 position then its correct, i++
    //if not then swap and continue to swap until the number at i is correct.

    static void swap(int[] arr, int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort (int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i]==i+1) {
                i++;
            }
            else {
                swap(arr,i,arr[i]-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
