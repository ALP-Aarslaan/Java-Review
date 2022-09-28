package com.company;

import java.util.Scanner;

public class FizzBuzz20 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        int num=scan.nextInt();
        if(num%5==0 || num%3==0)
            System.out.println("FizzBuzz");
        else if(num%5==0)
            System.out.println("Fizz");
        else if(num%3==0)
            System.out.println("Buzz");
        else
            System.out.println(num);


        /*switch(num1){
            case(num1%3==0 && num1%5==0):
                System.out.println("fizz");
                break;
            case(num1%3==0):
                    System.out.println("Buzz");
                break;
            case(num1%5==0):
                System.out.println("Fizz");
                break;
            default:
                System.out.println(num1);
        }

         */




    }
}
