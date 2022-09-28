package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingInput13 {
    public static void main(String[]args){
        //how to read input from user in java?
        Scanner scan= new Scanner(System.in);
        System.out.println("enter age:");
        byte age=scan.nextByte();
        System.out.println("you are "+ age);
        //how to take an input of floating point value
        System.out.println("enter mark:");
        float mark=scan.nextFloat();
        System.out.println("you got "+mark);
        //how to take input of a string
        /*System.out.println("enter your name:");
        String name=scan.next();
        System.out.println(name);*/
        /* in this way you cant print your whole name because next method take
        only one token when we use spaces or tabs between our writing java consider
        spaces as a token separator and prints the string before 1st space.
        in order to print whole line we have use another method called nextLine;
         */
        System.out.println("enter your  name:");
        String name = scan.nextLine();
        System.out.println(name);
    }
}
