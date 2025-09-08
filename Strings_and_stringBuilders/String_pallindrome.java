package Strings_and_stringBuilders;

public class String_pallindrome {
    static boolean isPallindrome(String str) {
        if (str == null || str.length()==0) return true;
        str=str.toLowerCase();
        for (int i= 0;i<str.length()/2;i++) {
            if (!(str.charAt(i)==str.charAt(str.length()-i-1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcacba";
        System.out.println(isPallindrome(str)?"pallindrome":"not pallindrome");
    }
    
}
