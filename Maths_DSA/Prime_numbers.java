package Maths_DSA;

public class Prime_numbers {

    static void primes(int n) {
        boolean[] arr = new boolean[n+1];
        for (int i=2;i*i<=n;i++) {
            if (!arr[i]) {
                for (int j=i*i;j<=n;j+=i) {
                    arr[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++) {
            if (!arr[i]) {
                System.out.print(i+"  ");
            }
        }
    }
    public static void main(String[] args) {
        primes(40);
    }
}
