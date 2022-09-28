package com.company;

public class EscapeSequence3 {
    public static void main(String[] args) {
        String name ="\"mohammad jonayed\"";
        System.out.println(name);
        //using backslash before double quote we can quote a name
        //use of "\n" to create a new line
        System.out.printf("%s\n",name);
        //use of backslash
        String name2 = "14\\\t3\\2020";
        System.out.println(name2);
        //use of "\t" to  create a tab between to words
        System.out.println(name2);
    }
}
