package Recursion.Array_Ques;

public class Linear_search {
    

    static int search(int[] arr, int target, int i) {
        if (i==arr.length) {
            return -1;
        }
        else if (arr[i]==target) {
            return i;
        }
        else {
            return search(arr, target, ++i);
        }    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(search(arr, 5, 0));
    }
}
