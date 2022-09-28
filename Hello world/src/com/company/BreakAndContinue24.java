package com.company;

import java.util.Scanner;

public class BreakAndContinue24 {
    public static void main(String[] args) {
        /* break statements terminate the loop and continue statement move
        to the beginning of the loop
         */
        //here will learn how to use continue and break statements
        Scanner scan=new Scanner(System.in);
        String input="";
        while (!input.equals("quit")){
            System.out.println("input");
            input=scan.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;

            System.out.println(input);
        }
    }
}
