package Recursion.Easy_Ques;

public class Triangle_pattern {
    static void inverted(int r, int c) {
        if (r==0) {
            return;
        }
        if (r>c) {
            System.out.print("* ");
            inverted(r, c+1);
        }
        else {
            System.out.println();
            inverted(r-1, 0);
        }        
    }

    static void triangle(int r, int c) {
        if (r==0) {
            return;
        }
        if (r>c) {
            triangle(r, c+1);
            System.out.print("* ");
        }
        else {
            triangle(r-1, 0);
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        triangle(4,0);
    }
}
