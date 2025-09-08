package Recursion.Easy_Ques;

public class Print_numbers {
    static void print(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
