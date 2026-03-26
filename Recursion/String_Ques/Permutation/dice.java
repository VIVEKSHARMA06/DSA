package Recursion.String_Ques.Permutation;

public class dice {

    public static void main(String[] args) {
        ans("", 4);
    }
    public static void ans (String str, int target) {
        if (target==0) {
            System.out.println(str);
            return;
        }
        for (int i=1;i<=target;i++) {
            ans(str + i,target-i);
        }
    } 
}
