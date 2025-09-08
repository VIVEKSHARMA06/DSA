package Recursion.Easy_Ques;

public class Reverse_number {
    static int x=0;
    static void rev(int n) {
        if (n==0) {
            return;
        }
        x=x*10+n%10;
        rev(n/10);
    }

    public static void main(String[] args) {
        rev(12345);
        System.out.println(x);
    }
}
