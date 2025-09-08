import java.util.*;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int rev=0;
        while (n>0) {
            int rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reversed number is : "+ rev);
        sc.close();
    }
}
