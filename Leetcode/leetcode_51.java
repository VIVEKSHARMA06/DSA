package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_51 {
    class Solution {

        List<List<String>> ans = new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {
            List<List<String>> board = new ArrayList<>();

            createBoard(board, n);
            solve(board, 0, 0);

            return ans;
        }

        public void solve(List<List<String>> board, int row, int col) {

            // All queens have been placed
            if (row == board.size()) {
                List<String> solution = new ArrayList<>();

                for (int i = 0; i < board.size(); i++) {
                    solution.add(String.join("", board.get(i)));
                }

                ans.add(solution);
                return;
            }

            while (col < board.size()) {

                if (isSafe(board, row, col)) {

                    // Place queen
                    board.get(row).set(col, "Q");

                    // Move to next row
                    solve(board, row + 1, 0);

                    // Backtrack
                    board.get(row).set(col, ".");

                }

                col++;
            }
        }

        boolean isSafe(List<List<String>> board, int i, int j) {

            // Column
            for (int k = 0; k < board.size(); k++) {
                if (board.get(k).get(j).equals("Q")) {
                    return false;
                }
            }

            // Left diagonal
            int min = Math.min(i, j);
            int tempj = j - min;

            for (int k = i - min; k < board.size() && tempj < board.size(); k++) {
                if (board.get(k).get(tempj).equals("Q")) {
                    return false;
                }
                tempj++;
            }

            // Right diagonal
            int steps = Math.min(i, board.size() - 1 - j);

            int row = i - steps;
            int col = j + steps;

            while (row < board.size() && col >= 0) {
                if (board.get(row).get(col).equals("Q")) {
                    return false;
                }

                row++;
                col--;
            }

            return true;
        }

        void createBoard(List<List<String>> board, int n) {

            for (int i = 0; i < n; i++) {
                List<String> row = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    row.add(".");
                }

                board.add(row);
            }
        }
    }
}
