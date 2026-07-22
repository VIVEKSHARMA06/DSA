package Leetcode;

public class Nth_Root_of_Integer {

    public static int root(int x, int n) {
        if (n == 1) {
            return x;
        }

        int s = 1;
        int e = x;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            double value = Math.pow(mid, n);

            if (value == x) {
                return mid;
            } else if (value < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
