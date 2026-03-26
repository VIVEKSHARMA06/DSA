import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate fibonacci : ");
        int n=sc.nextInt();
        for (int i=2; i<=n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("The " + n + "th fibonacci number is " + c);
        sc.close();
    }
}