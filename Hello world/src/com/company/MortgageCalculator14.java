package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MortgageCalculator14 {
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter main money:");
        double principle=scan.nextDouble();
        System.out.println("enter monthly interest rate:");
        double rate=scan.nextDouble();
        System.out.println("enter how many months you have to pay the loan:");
        double months=scan.nextDouble();
        double sum,total;
         sum= Math.pow ((1+rate),months);
        total=principle*((rate*sum)/(sum-1));
        System.out.printf("loan have to pay=%f\n",total);

    }
}
