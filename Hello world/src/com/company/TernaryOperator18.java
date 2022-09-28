package com.company;

public class TernaryOperator18 {
    public static void main(String[]args){
        int income=90_00;
        String classname;
        if(income >100_00)
            classname="first";
        else
            classname="economy";
        System.out.println(classname);
        //? mark an colon : is the ternary operator in java
        /* it works like when is the first statement true?
        if not then 2nd statement is true which is after the colon (:)
         */
        int income1=120_000;
        String className=income1>100_000?"first":"economy";
        System.out.println(className);

    }
}
