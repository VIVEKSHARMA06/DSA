package Recursion.String_Ques;

public class Skip_character {
    
    public static String add(String str) {
        if (str.length()<=0) {
            return "";
        }
        else if (str.charAt(0)!='a') {
            return (str.charAt(0)+add(str.substring(1)));
        }
        else {
            return add(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "abbcdabc";
        System.out.println(add(str));
    }
}
