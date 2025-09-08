package Strings_and_stringBuilders;

public class String_builder {
    public static void main(String[] args) {
        //string builders are used because they are mutable. strings are mutable
        //everytime when u assign a string variable a different value a new object is created and the previous one is left as waste in the string pool
        //but string builder variable's value is changed and not created.   
        StringBuilder str = new StringBuilder("abcd");
        System.out.println(str);

        //it has various methods
        System.out.println(str.append('e'));        //these change the original string builder
        System.out.println(str.reverse());
        System.out.println(str);

    }
}
