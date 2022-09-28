package com.company;

public class ForEachLoop25 {
    public static void main(String[] args) {
        /*java has a new kind of loop named for each loop to iterate
        over arrays and collections
         */
        String[] fruits = {"apple", "mango", "watermelon"};
        for (int i = 0; i <fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        /* we cant use for each loop in reverse order this is its limitations
            we cant find index using for each loop
         */
    }
}
