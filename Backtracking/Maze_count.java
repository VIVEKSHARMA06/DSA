package Backtracking;

public class Maze_count {

    public static void main(String[] args) {
        System.out.println(move(3, 3));
    }
    
    public static int move (int r, int c) {
        if (r==1 || c==1) {
            return 1;
        }

        int left=move(r-1, c);
        int right=move(r,c-1);
        return left+right;
    }
}
