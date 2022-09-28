package com.company;

import java.sql.SQLOutput;

public class TheMathClass11 {
    public static void main(String[] args) {
        //we will learn mathematical expression
        //we will see round method to roundup a floating point number
        Math.round(1.1F);
        int x=Math.round(1.1F);
        System.out.printf("roundup of x is :%d\n",x);
        //ceiling method return value of a floating point numbers equal or greater number
        int y=(int)Math.ceil(1.1F);
        System.out.printf("Ceiling of y is :%d\n",y);
        //floor method returns smaller or equal to the given floating number
        int z=(int)Math.floor(1.1F);
        System.out.printf("floor value of z is:%d\n",z);
        //another method is max which returns greater number between two numbers
        int result=Math.max(4,3);
        System.out.printf("greater between two numbers is:%d\n",result);
        //min method return smaller number between 2 numbers
        int result1=Math.min(1,2);
        System.out.printf("smallest number is :%d\n",result1);
        /*if we use random method every time we run the program we get different type
        value . we have to remember that it only accepts double value
         */
        double result3=Math.random();
        System.out.println(result3);
        //this number is floating point number between 0-1;
        //if we multiply the random number with any number it will give value between 0-that number
        double result4=Math.random()*5;
        System.out.println(result4);
        /* if we don't want decimal point we could use round method like:*/
        double result5=Math.round(Math.random()*20);
        System.out.println(result5);
        /*if we don't want any number after decimal point then we can use explicit casting
        like:
         */
        int result6=(int)Math.round(Math.random()*25);
        System.out.println(result6);
        //if we dont use round method here we will get every time zero
        int result7=(int)(Math.random()*30);
        System.out.println(result7);

    }
}
