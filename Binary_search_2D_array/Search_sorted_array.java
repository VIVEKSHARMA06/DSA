package Binary_search_2D_array; 
import java.util.Arrays;
public class Search_sorted_array {

    //we will start searching from top right
    //if the target is bigger than current value, we move down
    //if target is less than current value, we move left 

    static int [] search(int[][] arr,int target) {
        int row = 0, col = arr[0].length-1;
        while (row<arr.length && col>=0) {
            if (arr[row][col]==target) {
                return new int []{row,col};
            }
            else if (arr[row][col]>target) {
                col--;
            }
            else {
                row++;
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int[][] arr = new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {60, 61, 62, 63}
        };
        int target = 63;
        System.out.println(Arrays.toString(search(arr,target)));
    }
}
