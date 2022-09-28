package com.company;

public class Casting10 {
    public static void main(String[]args)
    {
        //we will learn here casting and type conversion
        //implicit casting or automatic casting.
        //here short type variable has 2 byte and integer have 4 byte
        /* so integer can store short easily
        in java short value is converted to an integer value but it is stored
        in some other unknown location then it calculated with integer value
         */
        short x=1;
        int y=x+2;
        System.out.printf("value of y is:%d\n",y);
        double a=1.1;
        double b=a+2;
        System.out.printf("value of b is:%f\n",b);
        /* in this example 2 is integer number but java is going to automatically
        cast 2 into a double type number 2.0 then it is added to 1.1
         */
        //in implicit casting we wont face data loss
        double c=1.1;
        int d=(int)c+2;
        System.out.printf("value of d is:%d\n",d);
        /* this is called explicit casting where we can change any type of data
        using 1st bracket like:(int)1.1
        it will print only 1 and it will not print any number after decimal point
         */
        /*explicit casting will cast with compatible numbers.like:
        byte>short>int>long>float>double.
        but it will not work between a string and integer
         */
        /* we can convert a string into a integer ,float,short,double type
        by using a package.example bellow:
         */
        String g="1.1";

        double f = Double.parseDouble(g) + 2;
        String w ="1";
        int h =Short.parseShort(w)+2;
        System.out.printf("total sum is:%d\n",f);
        System.out.printf("total sum is:%d\n",h);





    }
}
