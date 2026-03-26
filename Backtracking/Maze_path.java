package Backtracking;

import java.util.ArrayList;

public class Maze_path {
    public static void main(String[] args) {
        System.out.println(move(3, 3, ""));
    }
    
    public static ArrayList <String> move (int r, int c, String ans) {
        if (r==1 && c==1) {
            ArrayList <String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList <String> answer = new ArrayList<>();

        if (r!=1) {
            answer.addAll(move(r-1, c, ans+"D"));
        }
        if (c!=1) {
            answer.addAll(move(r, c-1, ans+"R"));
        }
        return answer;
    }

}
