package Leetcode;

public class leetcode_73 {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;

        for (int col=0; col<matrix[0].length;col++) {
            if (matrix[0][col]==0) {
                firstRow = true;
                break;
            }
        }

        for (int row = 0; row<matrix.length; row++) {
            if (matrix[row][0]==0) {
                firstColumn = true;
                break;
            }
        }

        for (int i=0; i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                if (matrix[i][j]==0) {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for (int i=1; i<matrix.length;i++) {
            for (int j=1;j<matrix[0].length;j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        if (firstRow) {
            for (int j=0;j<matrix[0].length;j++) {
                matrix[0][j]=0;
            }
        }

        if (firstColumn) {
            for (int i=0;i<matrix.length;i++) {
                matrix[i][0]=0;
            }
        }
    }
}
