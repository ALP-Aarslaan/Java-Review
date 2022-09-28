package com.company;

import java.util.Scanner;

public class DoWhileLoops23 {
    public static void main(String[] args) {
        //here we will learn about do while loop
        String input="";
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("INPUT");
            input=scan.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));
        /* do while loops execute conditions at least 1 time even if
        it is false;do while loop first execute then reads the condition if the
        condition true then the code proceed for 2nd time other wise not
         */
    }
}
