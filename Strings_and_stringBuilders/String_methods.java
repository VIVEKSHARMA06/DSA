package Strings_and_stringBuilders;

import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String str = "sharma";
        //these methods just return a new object and doesnt change the original string
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("ma"));
        System.out.println(str.lastIndexOf('a'));
        System.out.println("    abcd    ".strip());
        System.out.println(Arrays.toString(str.split("a")));
    }
}
