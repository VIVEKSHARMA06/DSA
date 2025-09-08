import java.util.*;
public class Count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(" Enter the number to be counted : ");
        int x = sc.nextInt();
        int count=0;
        while (n>0) {
            int rem = n%10;
            n/=10;
            if (rem==x) {
                count++;
            }
        }
        System.out.println("The count of "+x+" is : "+count);
        sc.close();
    }
}
