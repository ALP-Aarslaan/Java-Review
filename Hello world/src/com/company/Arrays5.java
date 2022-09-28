package com.company;

public class Arrays5 {
    public static void main(String[]args){
        //how to declare an array
        int num = 1;
        //in reference type data we have to use "new"
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println("\n\n");
        int[]num2 = {6,2,3,4,5};
        System.out.println(numbers.length);
        //sorting array class
        int[]num1={3,4,2,4,5,6};
        System.out.println(num1.length);
        java.util.Arrays.sort(num2);
        System.out.println(java.util.Arrays.toString(num2));

    }
}
