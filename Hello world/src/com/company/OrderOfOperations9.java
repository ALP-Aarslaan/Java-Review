package com.company;

public class OrderOfOperations9 {
    public static void main(String[] args) {
        //here we will learn order and operation
        int x=10+3*2;
        System.out.printf("total:%d\n",x);
        /*in math / "division" operator works first
        then multiplication'*',then subtraction'-'
        then addition'+';
         */
        int y=(10+3)*2;
        System.out.printf("total sum:%d\n",y);
        /*well in this case java will process 1st which one portion is in the 1st
        bracket and so on;
         */
        //order:'()'>'/'>'*'>'-'>'+'
    }
}
