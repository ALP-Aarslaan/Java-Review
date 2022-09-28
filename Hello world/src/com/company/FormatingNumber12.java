package com.company;

import java.text.NumberFormat;

public class FormatingNumber12 {
    public static void main(String[]args)
    {
        //1234567
        /*if we want to format numbers or want to represent as percentage
        then you need to format it .we can do it easily with java
         */
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result =currency.format(1234567.891);
        System.out.println(result);
        //method of formatting number into percent
        /* in order to change a variable name we may do mistake this is why we can use
        this process-
        in order to change variable name we have to select it then we have to right click
        then go to  refactor then rename . This is the proper way to rename a variable and
        it will change all the reference variable name in the same name as it was before
         */
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);


    }
}
