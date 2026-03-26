package Backtracking;

public class Maze_with_obstacles {
    public static void main(String[] args) {
        boolean arr[][] = new boolean[3][3];
        // System.out.println(Arrays.toString(arr[1]));
        arr[1][1]=true;
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

        if (r<arr.length-1) {
            move(r+1, c, ans+"D",arr);
        }
        if (c<arr[0].length-1) {
            move(r, c+1, ans+"R",arr);  
        }
    }
}
