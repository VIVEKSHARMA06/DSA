package String_Buffer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // The initial capacity of the StringBuffer is 16 characters. If the number of characters exceeds the capacity, it will automatically increase the capacity by doubling it.

        //constructors
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        // StringBuffer sb2 = new StringBuffer("H   e l  lo ");
        
        // StringBuffer sb3 = new StringBuffer(50);
        // This constructor creates a StringBuffer with an initial capacity of 50 characters. The buffer can hold up to 50 characters before it needs to be resized.

        sb.append(" World!");
        System.out.println(sb); // Output: Hello World!

        //some methods
        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World!

        sb.delete(5, 6);
        System.out.println(sb); // Output: Hello World!

        sb.reverse();
        System.out.println(sb); // Output: !dlroW olleH

        sb.replace(1,5, "i");

        // removing all white spaces from a StringBuffer
        String str = "H    e   l o   o  ";

        str.replaceAll("\\s","");
        System.out.println(str);  // Output: Hello

        String[] arr = str.split("\\");
        System.out.println(Arrays.toString(arr)); // Output: [H, e, l, o, o]

    }
    
}
