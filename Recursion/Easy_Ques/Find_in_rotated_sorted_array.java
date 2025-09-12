package Recursion.Easy_Ques;

public class Find_in_rotated_sorted_array {
    static int find(int[] arr,int s, int e, int target) {
        if (s>e) {
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target) {
            return mid;
        }
        else if (arr[s]<arr[mid]) {
            if (target>=arr[s] && target<arr[mid]) {
                return find(arr,0,mid-1, target);
            }
            else {
                return find(arr, mid+1,e, target);
            }
        }
        else {
            if (target>arr[mid] && target<=arr[e]) {
                return find(arr, mid+1, e, target);
            }
            else{
                return find(arr, s, mid-1, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(find(arr,0,arr.length-1,1));
    }
}
