package Leetcode;

public class leetcode_74 {
    static boolean binarySearch(int[] matrix, int target) {
        int start = 0, end = matrix.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        int rowStart = 0, rowEnd = rows - 1;
        int targetRow = -1;
        if (target>matrix[rows-1][cols-1] || target<matrix[0][0]) {
            return false;
        }

        while (rowStart <= rowEnd) {
            int midRow = rowStart + (rowEnd - rowStart) / 2;

            if (target >= matrix[midRow][0] && target <= matrix[midRow][cols - 1]) {
                targetRow = midRow;
                break;
            } else if (target < matrix[midRow][0]) {
                rowEnd = midRow - 1;
            } else {
                rowStart = midRow + 1;
            }
        }
        if (targetRow==-1) {
            return false;
        }

        return binarySearch(matrix[targetRow], target);
    }
}
