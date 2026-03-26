package Backtracking;
class N_knights {
    
    public static void main(String[] args) {
         boolean [][] board = new boolean[4][4];
        knights(0, 0, board, 4);
    }

    public static void knights (int row, int col, boolean [][] board, int knights) {
        if (knights==0) {
            display(board);
            System.out.println();
            return;
        }

        if (row==board.length){
            return;
        }

        if (col==board.length) {
            knights(row+1, 0, board, knights);
            return;
        }

        if (isSafe(row, col, board)) {
            board[row][col]=true;
            knights(row, col+1, board, knights-1);
            board[row][col]=false;
        }

        knights(row, col+1, board, knights);
    }

    public static boolean isSafe(int row, int col, boolean [][] board) {
        if (isValid(row-2, col-1, board)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
        if (isValid(row-2, col+1, board)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }
        if (isValid(row-1, col+2, board)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        if (isValid(row-1, col-2, board)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid (int row, int col, boolean [][] board) {
        if (row<board.length && row>=0 && col>=0 && col<board.length) {
            return true;
        }
        return false;
    }

    public static void display(boolean [][] board) {
    for (boolean [] row: board) {
        for (boolean element:row) {
            if (element) {
                System.out.print("O");
            }
            else {
                System.out.print("X");
            }
        }
        System.out.println();
    }
    }
}
