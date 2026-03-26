package Recursion.String_Ques.Permutation;

public class String_permutation {


    public static void func(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i=0;i<=p.length();i++) {
            func(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1));
        }
    }

    public static void main(String[] args) {
        // String str = "abc";
        func("", "abc");
    }
}
