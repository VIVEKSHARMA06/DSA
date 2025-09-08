package Sorting.Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

//leetcode 268
public class Leetcode_448 {

    static void swap(int[] arr, int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static List<Integer> cyclic_sort (int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i]==arr[arr[i]-1]) {
                i++;
            }
            else {
                swap(arr,i,arr[i]-1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j =0;j<arr.length;j++) {
            if (arr[j]!=j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,2,1};
        System.out.println(cyclic_sort(arr));
    }
}