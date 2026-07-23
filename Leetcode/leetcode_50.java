package Leetcode;

public class leetcode_50 {
    public static double myPow(double x, int n) {
        if (n==0) return 1;
        if (n==1) {
            return x;
        }
        if (n%2==0) {
            double a = myPow(x,n/2);
            return a*a; 
        }
        else {
            double a = myPow(x,(n-1)/2);
            return x*a*a;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 5));
    }
}
