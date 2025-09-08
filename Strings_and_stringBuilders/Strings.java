package Strings_and_stringBuilders;
public class Strings {
    public static void main(String[] args) {
        //strings are immutable
        //strings are stored in the string pool which is a separate memory in the heap.
        //strings are an object. here, name is a reference variable that is pointing to the object "Vivek"
        String name = "Vivek";
        name = "Sharma";
        //strings are immutable. name was pointing to Vivek but here, new object "Sharma" is created and now name is pointing to "Sharma". 
        System.out.println(name);   //"Sharma"

        String a = "abcd";
        String b = "abcd";
        String c = a;
        // == operator checks if both are pointing to same object.
        System.out.println(a==b);   //true 
        System.out.println(b==c);   //true

        String d = new String("abcd");
        System.out.println(a==d);   //false

        //but if u want to check value then use str.equals() method
        System.out.println(a.equals(d));

        System.out.println(d.charAt(0));     //'a'
        System.out.println(d.indexOf('c'));     //2

        float n = 12.34956f;        //this also rounds off till 2nd place after decimal. these are calles placeholders.
        System.out.printf("Formatted number is %.2f",n);
        System.out.println();


        // String Concatenation

        System.out.println('a' + 'b');        //char is converted to unidode integer value then added.
        
        System.out.println("a" + "b");      //strings are added
        
        System.out.println((char)('a'+3));  //char is converted to integer then added then typecasted.
        
        System.out.println("a"+1);          //this int is converted to wrapper class Integer then toString() method is call, so it will be like "a"+"1"
        
        // System.out.println(new Integer(5) + new ArrayList<Integer>()); 
        //this wont work because concatenation only works on primitives. it will work on objects like wrapper classes and arraylist only when atleast one of them is a string. 
    }
}
