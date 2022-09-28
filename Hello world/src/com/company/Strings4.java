package com.company;

public class Strings4 {
    public static void main(String[] args) {
        System.out.println("hello world");
        String messege = "mohammad jonayed sarkar";
        System.out.println(messege);
        //concatinate 2 strings we have to use (+) between to strings
        String messege1="      mohammad "+"jonayed "+"sarkar     ";
        System.out.println(messege1);
        //String is a class and we can access its members using "." dot operator.
        messege.endsWith("SArkar");//use of method (endsWith).
        System.out.println(messege.endsWith("SArkar"));
        System.out.printf("%s\n",messege);
        //use of method (strtsWith).
        System.out.println(messege.startsWith("mohammad"));
        //use of method length
        System.out.println(messege.length());
        //use of methood (indexOf) to find the index number of a character in string
        System.out.println(messege.indexOf("m"));
        //use of method (replace)
        System.out.println(messege.replace("sarkar","Arafin"));
        System.out.println(messege);
        /*in java strings are immutable , we cant change them
        so replace method don't change the original string
        it creates a new string
        any string modify a string returns a new string object
         */
        //use of method toLowerCase to convert all letters into lowercase
        System.out.println(messege.toLowerCase());
        //use of method toUpperCase to convert all letters to uppercase
        System.out.println(messege.toUpperCase());
        //use of method (trim)
        // it is used for to get rid of white spaces
        System.out.println(messege1.trim());




    }
}
