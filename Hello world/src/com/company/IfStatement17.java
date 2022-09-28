package com.company;

public class IfStatement17 {
    public static void main(String[]args){
        int temp =32;
        if(temp>30)
            System.out.println("its a hot day");
        /* if we want to add multiple statements under one if condition then we have to
        give a curly brace
         */
        if(temp>30)
        {
            System.out.println("Its a hot  day");
            System.out.println("Drink plenty of water");
        }
        else if(temp>=20&&temp<=30)
            System.out.println("beautiful day");
        else
            System.out.println("Cold day");


    }
}
