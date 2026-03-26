package Backtracking;

public class Maze_all_paths {
    public static void main(String[] args) {
        boolean arr[][] = new boolean[3][3];
        move(0, 0, "",arr);
    }
    
    public static void move (int r, int c, String ans, boolean [][]arr) {
        if (r==arr.length-1 && c==arr[0].length-1) {
            System.out.println(ans);
            return;
        }
        if (arr[r][c]) {
            return;
        }
        arr[r][c]=true;

        if (r<arr.length-1) {
            move(r+1, c, ans+"D",arr);
        }
        if (c<arr[0].length-1) {
            move(r, c+1, ans+"R",arr);  
        }
        if (r>0) {
            move(r-1, c, ans+"U", arr);
        }
        if (c>0) {
            move(r, c-1, ans+"L", arr);
        }
        arr[r][c]=false;
    }
}
