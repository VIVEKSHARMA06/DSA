package Recursion.String_Ques.Subsequence;

public class sub {
    public static void main(String[] args) {
       sub1("","abc"); 
    }
    public static void sub1(String p,String up) {
        if (up.length()<=0) {
            System.out.println(p);
            return;
        }

        sub1(p+up.charAt(0),up.substring(1));
        sub1(p,up.substring(1));
    }
}
