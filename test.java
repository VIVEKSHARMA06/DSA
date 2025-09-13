public class test {

    // Binary Search in a 1D array (row)
    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 9;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // First, find the row where the target may exist
        int rowStart = 0, rowEnd = rows - 1;
        int targetRow = -1;

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

        if (targetRow == -1) {
            System.out.println(-1);  // Target not in any row
        } else {
            int colIndex = binarySearch(matrix[targetRow], target);
            System.out.println(targetRow + "," + colIndex);  // Prints row and column index of target
        }
    }
}
