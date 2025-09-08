package Recursion.Easy_Ques;

public class Factorial {
    static int fact(int n) {
        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
