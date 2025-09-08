package Maths_DSA;

public class Square_root {
    static void sqrt(int n, int p) {
        int start = 0, end = n;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                ans = mid;
                break;
            }
            else if (mid * mid < n) {
                ans = mid; 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        double root = ans;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }

        System.out.println("Root of " + n + " is " + root);
    }

    public static void main(String[] args) {
        sqrt(40, 3);
    }
}
