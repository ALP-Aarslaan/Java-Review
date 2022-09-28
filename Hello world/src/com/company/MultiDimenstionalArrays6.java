package com.company;

import java.util.Arrays;

public class MultiDimenstionalArrays6 {
    public static void main(String[] args) {
        int [][] num1=new int[2][3];
        num1[0][0]=1;
        System.out.println(java.util.Arrays.toString(num1));
        //to print multidimensional arrays we use a method 'deepToString';
        System.out.println(Arrays.deepToString(num1));
        int [][][] num2=new int[2][3][5];
        System.out.println(Arrays.deepToString(num2));
        int [][]num3={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(num3));

    }
}
