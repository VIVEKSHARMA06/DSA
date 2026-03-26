package Recursion.String_Ques;

public class Skip_string {

    public static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }
        else if (str.startsWith("apple")) {
            return str.substring(5);
        }
        else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "abcdappleefgh";
        System.out.println(skip(str));
    }
}
