package com.company;

import java.util.Scanner;

public class WhileLoops22 {
    public static void main(String[]args){
        //here we will learn how to initialize while loops
        int i=0;
        while (i>0){
            System.out.println("hello world");
            i--;
        }
        /*we use while loops when we dont know how many times
        we want the repetition
         */
        Scanner scan=new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.println("input");
            input=scan.next().toLowerCase();
            System.out.println(input);
        }
    }
}
