package Sorting;

import java.util.Arrays;

public class Selection_sort {
    //find max element, then swap it with last element of the unsorted part of array 
    //the loop is run for n-2 times because last element will already be sorted if we sort till second last element. 
    //then we find the max element from 0 to last number of unsorted array and swap with last

    static void swap(int[] arr, int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int max (int[] arr,int end) {
        int max=0;
        for (int i=1;i<=end;i++) {
            if (arr[i]>arr[max]) {
                max=i;
            }
        }
        return max;
    }
    
    static void sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            int last = arr.length-i-1;
            int max = max(arr,last);
            swap(arr,max,last);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,325,4,6,4,2,4,36,0,-14};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
